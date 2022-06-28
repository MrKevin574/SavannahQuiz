package com.mrkevin574.quizsabana.domain

import com.mrkevin574.quizsabana.data.local.ScoreDao
import com.mrkevin574.quizsabana.domain.model.Score
import com.mrkevin574.quizsabana.domain.model.toDomain
import com.mrkevin574.quizsabana.domain.model.toEntity
import javax.inject.Inject
import javax.inject.Singleton

class ScoreRepository @Inject constructor(
    private val dao : ScoreDao
    )  {
    suspend fun saveScore(score : Score)
    {
        dao.insertScore(score.toEntity())
    }

    suspend fun getAllScore() : List<Score>{
        return dao.getAllScores().map { it.toDomain() }
    }
}