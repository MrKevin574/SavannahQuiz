package com.mrkevin574.quizsabana.presentation.screens.quiz

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mrkevin574.quizsabana.domain.model.Answer
import com.mrkevin574.quizsabana.ui.theme.PrimaryColor
import com.mrkevin574.quizsabana.ui.theme.ProgressBarColor
import com.mrkevin574.quizsabana.ui.theme.SecondaryColor

@Composable
fun AnswerButton(
    answer: Answer,
    questionState: QuestionState,
    clicked : Boolean,
    onClick: () -> Unit,
) {
    val textAndBorderColor = when(questionState)
    {
        QuestionState.RESUME -> {
            SecondaryColor
        }
        QuestionState.SELECTED -> {
            if(answer.isCorrect)
            {
                PrimaryColor
            }else{
                ProgressBarColor
            }
        }
    }
    OutlinedButton(
        onClick = onClick,
        shape = CircleShape,
        border = BorderStroke(1.dp, textAndBorderColor),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        modifier = Modifier
            .height(80.dp)
            .padding(top = 10.dp, start = 30.dp, end = 30.dp),
        enabled = !clicked
    ) {
        Text(
            text = answer.answer,
            fontSize = 16.sp,
            color = textAndBorderColor
        )
    }
}
