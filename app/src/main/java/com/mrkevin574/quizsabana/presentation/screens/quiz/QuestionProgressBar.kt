package com.mrkevin574.quizsabana.presentation.screens.quiz

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mrkevin574.quizsabana.ui.theme.ProgressBarColor

@Composable
fun QuestionProgressBar(progress : Float) {
    LinearProgressIndicator(
        progress = progress,
        color = ProgressBarColor,
        modifier = Modifier
            .fillMaxWidth()
            .height(10.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PRevieQuestion()
{
    QuestionProgressBar(progress = 0.2f)
}