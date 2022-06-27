package com.mrkevin574.quizsabana.presentation.screens.quiz

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mrkevin574.quizsabana.ui.theme.PrimaryColor
import com.mrkevin574.quizsabana.ui.theme.ProgressBarColor

@Composable
fun QuestionProgressBar(progress : Float) {
    LinearProgressIndicator(
        progress = progress,
        color = ProgressBarColor,
        modifier = Modifier.width(100.dp).height(10.dp)
    )
}