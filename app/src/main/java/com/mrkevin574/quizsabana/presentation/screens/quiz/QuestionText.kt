package com.mrkevin574.quizsabana.presentation.screens.quiz

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mrkevin574.quizsabana.ui.theme.SecondaryTextColor

@Composable
fun QuestionText(text : String)
{
    Text(
        text = text,
        color = SecondaryTextColor,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 120.dp, start = 50.dp, end = 50.dp),
        textAlign = TextAlign.Center,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
}
