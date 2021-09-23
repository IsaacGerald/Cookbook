package com.example.myapplication.presentation.ui.recipe

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.RecipeRepository_Impl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class RecipeViewModel
@Inject constructor(
    private val repository: RecipeRepository_Impl,
    private val savedStateHandle: SavedStateHandle
): ViewModel() {


    fun getRecipes() {
        viewModelScope.launch {
            repository.getRecipes()
        }
    }

}