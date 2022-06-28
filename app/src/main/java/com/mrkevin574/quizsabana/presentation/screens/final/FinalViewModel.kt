package com.mrkevin574.quizsabana.presentation.screens.final

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mrkevin574.quizsabana.domain.ScoreRepository
import com.mrkevin574.quizsabana.domain.model.Score
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FinalViewModel @Inject constructor(private val repository: ScoreRepository) : ViewModel() {
    fun saveScore(name : String, score : Float)
    {
        viewModelScope.launch {
            repository.saveScore(Score(name, score))
        }
    }
}