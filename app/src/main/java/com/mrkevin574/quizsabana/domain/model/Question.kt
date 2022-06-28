package com.mrkevin574.quizsabana.domain.model

import com.mrkevin574.quizsabana.presentation.screens.quiz.QuestionState

data class Question(
    val question : String = "",
    val answers : MutableList<Answer> = mutableListOf(),
    val questionState: QuestionState = QuestionState.RESUME)
