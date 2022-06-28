package com.mrkevin574.quizsabana.presentation.screens.score

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mrkevin574.quizsabana.domain.ScoreRepository
import com.mrkevin574.quizsabana.domain.model.Score
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScoreViewModel @Inject constructor(private val repository: ScoreRepository) : ViewModel(){
    private val _scores = mutableStateOf(ScoreScreenState())
    val scores : State<ScoreScreenState> = _scores

    init {
        viewModelScope.launch {
            _scores.value = scores.value.copy(
                scores = repository.getAllScore()
            )
        }
    }

    fun saveScore(name : String, score : Float)
    {
        viewModelScope.launch {
            repository.saveScore(Score(name, score))
        }
    }
}