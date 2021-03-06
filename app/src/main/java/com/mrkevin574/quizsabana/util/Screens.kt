package com.mrkevin574.quizsabana.util

sealed class Screens(val route : String)
{
    object FinalScreen : Screens("final_screen/{$SCORE_KEY}"){
        fun passScore(score : Float) = "final_screen/$score"
    }
    object QuizScreen : Screens("quiz_screen")
    object ScoreScreen : Screens("score_screen")
    object WelcomeScreen : Screens("welcome_screen")
}
