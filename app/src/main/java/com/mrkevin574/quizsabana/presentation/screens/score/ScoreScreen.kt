package com.mrkevin574.quizsabana.presentation.screens.score

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mrkevin574.quizsabana.R
import com.mrkevin574.quizsabana.domain.model.Score
import com.mrkevin574.quizsabana.ui.theme.PrimaryColor
import com.mrkevin574.quizsabana.ui.theme.PrimaryTextColor

@Composable
fun ScoreScreen(
    navController: NavController,
    viewModel: ScoreViewModel = hiltViewModel()
) {
    val scoreState = viewModel.scores.value
    if (scoreState.scores.isEmpty()) {
        TextNotScore()
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(PrimaryColor)
        ) {
            HeaderScore()
            LazyColumn(
                modifier = Modifier.padding(top = 100.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {
                var counter = 1
                items(scoreState.scores)
                {
                    ScoreItem(score = it, rank = counter)
                    counter++
                    Divider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(2.dp),
                        color = Color.White
                    )
                }
            }
        }

    }

}

@Composable
fun HeaderScore() {
    Text(
        text = stringResource(R.string.header_score),
        color = PrimaryTextColor,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 34.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 80.dp, start = 50.dp, end = 50.dp),
        textAlign = TextAlign.Center
    )
}

@Composable
fun ScoreItem(score: Score, rank: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    )
    {
        Text(
            text = "${rank}. ${score.name}",
            color = PrimaryTextColor,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "${score.score.toInt()}",
            color = PrimaryTextColor,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
    }

}

@Composable
fun TextNotScore() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.not_score),
            color = PrimaryTextColor,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .background(PrimaryColor),
            textAlign = TextAlign.Center
        )
    }

}