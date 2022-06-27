package com.mrkevin574.quizsabana.presentation.screens.welcome

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mrkevin574.quizsabana.presentation.Screens
import com.mrkevin574.quizsabana.ui.theme.PrimaryColor
import com.mrkevin574.quizsabana.R

@Composable
fun WelcomeScreen(navController: NavController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        WelcomeText()
        Image(
            painter = painterResource(id = R.drawable.cheetah),
            contentDescription = stringResource(R.string.cheetah),
            modifier = Modifier.padding(top = 100.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            ButtonWelcome(text = "Score") {
                navController.navigate(Screens.ScoreScreen.route)
            }
            ButtonWelcome(text = "Start") {
                navController.navigate(Screens.QuizScreen.route)
            }
        }
    }
}

@Composable
fun ButtonWelcome(text : String, onClick : () -> Unit)
{
    OutlinedButton(
        onClick = onClick,
        shape = CircleShape,
        border = BorderStroke(2.dp, Color.White),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        modifier = Modifier
            .width(180.dp)
            .height(90.dp)
            .padding(10.dp)
    ) {
        Text(
            text = text,
            color = Color.White
        )
    }
}
