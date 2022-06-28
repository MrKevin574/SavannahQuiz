package com.mrkevin574.quizsabana.presentation.screens.quiz

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mrkevin574.quizsabana.util.Screens
import androidx.compose.runtime.LaunchedEffect as LaunchedEffect1

@Composable
fun QuizScreen(
    navController: NavController,
    viewModel: QuizViewModel = hiltViewModel()
) {
    val question = viewModel.question.value
    val scoreState = viewModel.scoreState.value
    val quizState = viewModel.quizState.value

    if (quizState.finalized) {
        LaunchedEffect1(quizState) {
            navController.navigate(Screens.FinalScreen.passScore(viewModel.score))
        }

    }

    if (question.answers.isNotEmpty()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            QuestionText(text = question.question)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AnswerButton(
                    answer = question.answers[0],
                    questionState = question.questionState,
                    clicked = question.answers[0].clicked
                ) {
                    viewModel.onClickAnswer(index = 0)
                }
                Spacer(modifier = Modifier.height(10.dp))
                AnswerButton(
                    answer = question.answers[1],
                    questionState = question.questionState,
                    clicked = question.answers[1].clicked
                ) {
                    viewModel.onClickAnswer(index = 1)
                }
                AnswerButton(
                    answer = question.answers[2],
                    questionState = question.questionState,
                    clicked = question.answers[2].clicked
                ) {
                    viewModel.onClickAnswer(index = 2)
                }
            }
            QuestionProgressBar(scoreState.actualScore)
        }
    }

}

