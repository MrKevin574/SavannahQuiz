package com.mrkevin574.quizsabana.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val AppColors = lightColors(
    primary = PrimaryColor,
    primaryVariant = PrimaryVariant,
    secondary = SecondaryColor
)

@Composable
fun QuizSabanaTheme(content: @Composable () -> Unit) {

    val systemUIController = rememberSystemUiController()

    systemUIController.setNavigationBarColor(PrimaryColor, false)

    MaterialTheme(
        colors = AppColors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}