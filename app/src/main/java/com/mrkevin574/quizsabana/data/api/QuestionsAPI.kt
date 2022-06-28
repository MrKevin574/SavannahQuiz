package com.mrkevin574.quizsabana.data.api

import android.content.Context
import com.mrkevin574.quizsabana.R
import com.mrkevin574.quizsabana.domain.model.Answer
import com.mrkevin574.quizsabana.domain.model.Question
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class QuestionsAPI @Inject constructor(
    @ApplicationContext private val context: Context
) {
    fun getAllQuestions() = mutableListOf(
        Question(
            question = context.getString(R.string.question_1),
            mutableListOf(
                Answer(context.getString(R.string.america), false),
                Answer(context.getString(R.string.europe), false),
                Answer(context.getString(R.string.africa), true),
            )
        ),
        Question(
            question = context.getString(R.string.question_2),
            mutableListOf(
                Answer(context.getString(R.string.the_lion), true),
                Answer(context.getString(R.string.the_eagle), false),
                Answer(context.getString(R.string.the_human), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_3),
            mutableListOf(
                Answer(context.getString(R.string.warm), false),
                Answer(context.getString(R.string.tropical), true),
                Answer(context.getString(R.string.cold), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_4),
            mutableListOf(
                Answer(context.getString(R.string.domestic), false),
                Answer(context.getString(R.string.wild), true),
                Answer(context.getString(R.string.smart), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_5),
            mutableListOf(
                Answer(context.getString(R.string.cheetah), true),
                Answer(context.getString(R.string.the_lion), false),
                Answer(context.getString(R.string.monkey), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_6),
            mutableListOf(
                Answer(context.getString(R.string.no), true),
                Answer(context.getString(R.string.yes), false),
                Answer(context.getString(R.string.sometimes), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_7),
            mutableListOf(
                Answer(context.getString(R.string.disney), false),
                Answer(context.getString(R.string.discovery_kids), false),
                Answer(context.getString(R.string.discovery_channel), true),
            )
        ),
        Question(
            question = context.getString(R.string.question_8),
            mutableListOf(
                Answer(context.getString(R.string.number1), false),
                Answer(context.getString(R.string.number2), false),
                Answer(context.getString(R.string.number0), true),
            )
        ),
        Question(
            question = context.getString(R.string.question_9),
            mutableListOf(
                Answer(context.getString(R.string.yes), false),
                Answer(context.getString(R.string.no), true),
                Answer(context.getString(R.string.sometimes), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_10),
            mutableListOf(
                Answer(context.getString(R.string.galleces), false),
                Answer(context.getString(R.string.penguins), true),
                Answer(context.getString(R.string.polar), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_11),
            mutableListOf(
                Answer(context.getString(R.string.galleces), true),
                Answer(context.getString(R.string.penguins), false),
                Answer(context.getString(R.string.polar), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_12),
            mutableListOf(
                Answer(context.getString(R.string.elephant), true),
                Answer(context.getString(R.string.the_lion), false),
                Answer(context.getString(R.string.cheetah), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_13),
            mutableListOf(
                Answer(context.getString(R.string.elephant), false),
                Answer(context.getString(R.string.buffalo), true),
                Answer(context.getString(R.string.cheetah), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_14),
            mutableListOf(
                Answer(context.getString(R.string.the_females), true),
                Answer(context.getString(R.string.the_males), false),
                Answer(context.getString(R.string.the_puppies), false),
            )
        ),
        Question(
            question = context.getString(R.string.question_15),
            mutableListOf(
                Answer(context.getString(R.string.the_lion), false),
                Answer(context.getString(R.string.cheetah), false),
                Answer(context.getString(R.string.wild_dogs), true),
            )
        )
    )
}

