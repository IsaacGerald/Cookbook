package com.example.myapplication.domain

import com.example.myapplication.data.cache.RecipeCacheMapper
import com.example.myapplication.data.network.ApiService
import com.example.myapplication.data.network.model.RecipeNetworkMapper
import com.example.myapplication.domain.model.Recipe
import com.example.myapplication.domain.util.EntityMapper
import javax.inject.Inject


interface RecipeRepository {

   suspend fun getRecipes(): List<Recipe>


}