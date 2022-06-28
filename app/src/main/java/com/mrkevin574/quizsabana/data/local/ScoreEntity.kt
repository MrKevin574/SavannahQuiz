package com.mrkevin574.quizsabana.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ScoreEntity(
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    @ColumnInfo(name = "name") val name : String?,
    @ColumnInfo(name = "score") val score : Float?
)