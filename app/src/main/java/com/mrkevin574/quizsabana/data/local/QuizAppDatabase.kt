package com.mrkevin574.quizsabana.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ScoreEntity::class], version = 1, exportSchema = false)
abstract class QuizAppDatabase : RoomDatabase(){
    abstract fun scoreDao() : ScoreDao
}