package com.mrkevin574.quizsabana.presentation.screens.final

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun FinalScreen(navController: NavController, score : Float)
{
    Log.w("FINAL_SCORE", "$score")
}