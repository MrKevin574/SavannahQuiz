package com.mrkevin574.quizsabana.domain

import com.mrkevin574.quizsabana.data.api.getAllQuestions
import com.mrkevin574.quizsabana.domain.model.Question
import com.mrkevin574.quizsabana.util.QUESTIONS_COUNT

class QuestionsRepository()
{
    fun getRandomQuestions() : List<Question>
    {
        val questions = getAllQuestions()
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