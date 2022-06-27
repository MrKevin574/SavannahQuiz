package com.mrkevin574.quizsabana.domain

import android.content.Context
import com.mrkevin574.quizsabana.data.api.QuestionsAPI
import com.mrkevin574.quizsabana.domain.model.Question
import com.mrkevin574.quizsabana.util.QUESTIONS_COUNT
import javax.inject.Inject

class QuestionsRepository @Inject constructor(private val api : QuestionsAPI)
{
    fun getRandomQuestions() : MutableList<Question>
    {
        val questions = api.getAllQuestions()
        val randomQuestions = mutableListOf<Question>()

        while (randomQuestions.size != QUESTIONS_COUNT)
        {
            val question = questions.random()
            questions.remove(question)
            randomQuestions.add(question)
        }

        return randomQuestions
    }
}