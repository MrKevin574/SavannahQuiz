package com.mrkevin574.quizsabana.presentation.screens.quiz

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.mrkevin574.quizsabana.domain.QuestionsRepository
import com.mrkevin574.quizsabana.presentation.QuizViewModel
import com.mrkevin574.quizsabana.presentation.Screens

@Composable
fun QuizScreen(
    navController: NavController,
    viewModel : QuizViewModel = hiltViewModel()
)
{
    val question = viewModel.question.value

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        QuestionText(text = question.question)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            QuestionButton(text = question.answers[0].answer) {
                viewModel.onAnswerSelected(
                    answer = question.answers[0],
                    onFinalized = { onFinalized(navController, viewModel.score)}
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            QuestionButton(text = question.answers[1].answer){
                viewModel.onAnswerSelected(
                    answer = question.answers[1],
                    onFinalized = { onFinalized(navController, viewModel.score)}
                )
            }
            QuestionButton(text = question.answers[2].answer){
                viewModel.onAnswerSelected(
                    answer = question.answers[2],
                    onFinalized = { onFinalized(navController, viewModel.score)}
                )
            }
        }
        QuestionProgressBar(100f)
    }
}

private fun onFinalized(navController: NavController, score : Int)
{
    navController.navigate(Screens.FinalScreen.passScore(score))
}