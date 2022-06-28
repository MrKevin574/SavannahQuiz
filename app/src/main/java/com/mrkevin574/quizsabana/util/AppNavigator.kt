package com.mrkevin574.quizsabana.util

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.mrkevin574.quizsabana.presentation.screens.final.FinalScreen
import com.mrkevin574.quizsabana.presentation.screens.quiz.QuizScreen
import com.mrkevin574.quizsabana.presentation.screens.score.ScoreScreen
import com.mrkevin574.quizsabana.presentation.screens.welcome.WelcomeScreen

@Composable
fun AppNavigator()
{
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.WelcomeScreen.route)
    {
        composable(Screens.WelcomeScreen.route){ WelcomeScreen(navController = navController)}
        composable(Screens.QuizScreen.route){ QuizScreen(navController = navController) }
        composable(Screens.ScoreScreen.route){ ScoreScreen() }
        composable(
            Screens.FinalScreen.route,
        arguments = listOf(navArgument(SCORE_KEY) {type = NavType.FloatType})
        ){ navBackStrategy ->
            val score = navBackStrategy.arguments?.getFloat(SCORE_KEY)
            score?.let {
                FinalScreen(navController = navController, score = it)
            }
        }
    }
}