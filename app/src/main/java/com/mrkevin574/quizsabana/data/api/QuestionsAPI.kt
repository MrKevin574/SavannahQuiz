package com.mrkevin574.quizsabana.data.api

import android.content.res.Resources
import com.mrkevin574.quizsabana.R
import com.mrkevin574.quizsabana.domain.model.Answer
import com.mrkevin574.quizsabana.domain.model.Question

fun getAllQuestions() = mutableListOf(
    Question(
        question = Resources.getSystem().getString(R.string.question_1),
        listOf(
            Answer(Resources.getSystem().getString(R.string.america), false),
            Answer(Resources.getSystem().getString(R.string.europe), false),
            Answer(Resources.getSystem().getString(R.string.africa), true),
        )
    ),
    Question(
        question = Resources.getSystem().getString(R.string.question_2),
        listOf(
            Answer(Resources.getSystem().getString(R.string.the_lion), false),
            Answer(Resources.getSystem().getString(R.string.the_eagle), false),
            Answer(Resources.getSystem().getString(R.string.the_human), true),
        )
    ),
    Question(
        question = Resources.getSystem().getString(R.string.question_3),
        listOf(
            Answer(Resources.getSystem().getString(R.string.warm), false),
            Answer(Resources.getSystem().getString(R.string.tropical), false),
            Answer(Resources.getSystem().getString(R.string.cold), true),
        )
    )


)