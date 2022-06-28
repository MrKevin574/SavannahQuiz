package com.mrkevin574.quizsabana.presentation.screens.welcome

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mrkevin574.quizsabana.R
import com.mrkevin574.quizsabana.ui.theme.PrimaryTextColor
import com.mrkevin574.quizsabana.ui.theme.TitanOneFamily

@Composable
fun WelcomeText()
{
    Text(
        text = stringResource(R.string.sabana_quiz),
        fontFamily = TitanOneFamily,
        textAlign = TextAlign.Center,
        fontSize = 40.sp,
        color = PrimaryTextColor,
        modifier = Modifier.fillMaxWidth()
            .padding(top = 90.dp)
    )
}
