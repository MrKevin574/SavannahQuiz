package com.mrkevin574.quizsabana.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.mrkevin574.quizsabana.R

private val AppColors = lightColors(
    primary = PrimaryColor,
    primaryVariant = PrimaryVariant,
    secondary = SecondaryColor
)

val TitanOneFamily = FontFamily(
    Font(R.font.titanone, FontWeight.Normal)
)

val AnekLatinFamily = FontFamily(
    Font(R.font.aneklatin_regular, FontWeight.Normal),
    Font(R.font.aneklatin_bold, FontWeight.Bold),
    Font(R.font.aneklatin_extrabold, FontWeight.ExtraBold),
    Font(R.font.aneklatin_light, FontWeight.Light),
    Font(R.font.aneklatin_extralight, FontWeight.ExtraLight),
    Font(R.font.aneklatin_semibold, FontWeight.ExtraBold),
    Font(R.font.aneklatin_thin, FontWeight.Thin),
    Font(R.font.aneklatin_medium, FontWeight.Medium)
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