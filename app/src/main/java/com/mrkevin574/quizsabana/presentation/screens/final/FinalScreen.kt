package com.mrkevin574.quizsabana.presentation.screens.final

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mrkevin574.quizsabana.ui.theme.PrimaryColor
import com.mrkevin574.quizsabana.ui.theme.PrimaryTextColor
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.mrkevin574.quizsabana.R

@Composable
fun FinalScreen(navController: NavController? = null, score: Float) {

    var name by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextInfoScore()
        TextScore(score = score.toString())
        TextSaveScore()
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = {
                Text(
                    text = stringResource(R.string.name),
                    color = Color.White
                )
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = PrimaryTextColor,
                unfocusedBorderColor = PrimaryTextColor
            ),
            textStyle = TextStyle(
                color = PrimaryTextColor,
                fontSize = 18.sp
            ),
        )
        ButtonSaveScore {

        }
    }
}

@Preview
@Composable
fun PreviewFinalScreen() {
    FinalScreen(score = 200f)
}

@Composable
fun ButtonSaveScore(onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        shape = RoundedCornerShape(30),
        border = BorderStroke(7.dp, Color.White),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        modifier = Modifier
            .height(130.dp)
            .width(200.dp)
            .padding(top = 60.dp, start = 30.dp, end = 30.dp)
    ) {
        Text(
            text = "Save",
            fontSize = 16.sp,
            color = Color.White
        )
    }
}


@Composable
fun TextSaveScore() {
    Text(
        text = "Input your name: ",
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal,
        color = PrimaryTextColor,
        modifier = Modifier.padding(top = 100.dp)
    )
}

@Composable
fun TextInfoScore() {
    Text(
        text = "Your score is: ",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        color = PrimaryTextColor
    )
}

@Composable
fun TextScore(score: String) {
    Text(
        text = score,
        fontSize = 32.sp,
        fontWeight = FontWeight.ExtraBold,
        color = PrimaryTextColor
    )
}