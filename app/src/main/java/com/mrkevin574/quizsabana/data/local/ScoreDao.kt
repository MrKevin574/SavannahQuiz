package com.mrkevin574.quizsabana.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ScoreDao {
    @Query("SELECT * FROM ScoreEntity ORDER BY score DESC")
    suspend fun getAllScores() : List<ScoreEntity>

    @Insert
    suspend fun insertScore(scoreEntity: ScoreEntity)
}