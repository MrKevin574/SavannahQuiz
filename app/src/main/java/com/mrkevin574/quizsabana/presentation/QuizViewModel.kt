package com.mrkevin574.quizsabana.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.mrkevin574.quizsabana.domain.QuestionsRepository
import com.mrkevin574.quizsabana.domain.model.Answer
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val repository: QuestionsRepository
) : ViewModel(){


    var score = 0

    private val questions = repository.getRandomQuestions()
    val question = mutableStateOf(questions.random())

    private fun nextQuestion(onFinalized : () -> Unit)  {
        if(questions.isEmpty()) onFinalized()
        else{
            question.value = questions.random()
            questions.remove(question.value)
        }
    }

    fun onAnswerSelected(answer : Answer, onFinalized: () -> Unit)
    {
        if(answer.isCorrect)
        {

        }else{

        }
        nextQuestion(onFinalized = onFinalized)
    }

}