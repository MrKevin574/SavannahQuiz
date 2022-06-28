package com.mrkevin574.quizsabana.domain.model

import com.mrkevin574.quizsabana.data.local.ScoreEntity

data class Score(val name : String = "", val score : Float = 0f)

fun Score.toEntity() = ScoreEntity(name = this.name, score = this.score)

fun ScoreEntity.toDomain() = Score(name = this.name ?: "Not defined", score = this.score ?: 0f)
