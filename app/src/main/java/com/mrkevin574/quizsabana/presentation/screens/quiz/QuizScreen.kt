package com.mrkevin574.quizsabana.presentation.screens.quiz

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun QuizScreen(navController: NavController)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        QuestionText(text = "What are you doing?")
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            QuestionButton(text = "Fine and you")
            Spacer(modifier = Modifier.height(10.dp))
            QuestionButton(text = "Fine and you")
            QuestionButton(text = "Fine and you")
        }
        QuestionProgressBar(100f)
    }
}