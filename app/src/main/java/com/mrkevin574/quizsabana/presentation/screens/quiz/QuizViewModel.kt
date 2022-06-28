package com.mrkevin574.quizsabana.presentation.screens.quiz

import android.os.CountDownTimer
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mrkevin574.quizsabana.domain.QuestionsRepository
import com.mrkevin574.quizsabana.domain.model.Question
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
     repository: QuestionsRepository
) : ViewModel() {

    private val _question = mutableStateOf(Question())
    private var questions: MutableList<Question> = mutableListOf()
    val question: State<Question> = _question

    private val _scoreState = mutableStateOf(ScoreState())
    val scoreState: State<ScoreState> = _scoreState

    private val _quizState = mutableStateOf(QuizState())
    val quizState: State<QuizState> = _quizState

    var score = 0f

    private val timer = object : CountDownTimer(30000, 1) {
        override fun onTick(millisUntilFinished: Long) {
            _scoreState.value = scoreState.value.copy(
                actualScore = (millisUntilFinished.toFloat() / 30000)
            )
        }

        override fun onFinish() {
            nextOrFinish()
        }
    }

    init {
        questions = repository.getRandomQuestions()
        getNewQuestion()
        timer.start()
    }

    fun onClickAnswer(index: Int) {
        timer.cancel()
        question.value.answers[index].clicked = true
        _question.value = question.value

        if (question.value.answers[index].isCorrect) score += (scoreState.value.actualScore * 30f)
        nextOrFinish()
    }

    private fun nextOrFinish() {
        _question.value = question.value.copy(
            questionState = QuestionState.SELECTED
        )
        viewModelScope.launch {
            delay(2000)
            if (questions.isEmpty()) {
                finalizeQuiz()
            } else getNewQuestion()
        }
    }

    private fun getNewQuestion() {
        val newQuestion = questions.random()
        questions.remove(newQuestion)
        _question.value = question.value.copy(
            question = newQuestion.question,
            answers = newQuestion.answers,
            questionState = QuestionState.RESUME
        )
        timer.start()
    }

    private fun finalizeQuiz() {
        timer.cancel()
        _quizState.value = quizState.value.copy(
            finalized = true
        )
    }
}