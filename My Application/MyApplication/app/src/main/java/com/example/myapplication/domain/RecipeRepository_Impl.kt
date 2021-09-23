package com.example.myapplication.domain

import android.util.Log
import com.example.myapplication.data.cache.RecipeCacheMapper
import com.example.myapplication.data.cache.RecipeDatabase
import com.example.myapplication.data.network.ApiService
import com.example.myapplication.data.network.model.RecipeNetworkEntity
import com.example.myapplication.data.network.model.RecipeNetworkMapper
import com.example.myapplication.domain.model.Recipe
import java.lang.Exception
import javax.inject.Inject

class RecipeRepository_Impl
@Inject constructor(
    private val db: RecipeDatabase,
    private val apiService: ApiService,
    private val cacheMapper: RecipeCacheMapper,
    private val networkMapper: RecipeNetworkMapper
): RecipeRepository {
    private  val TAG = RecipeRepository_Impl::class.java.simpleName

    override suspend fun getRecipes(): List<Recipe> {
        val recipeNetworkEntity = mutableListOf<RecipeNetworkEntity>()
        try {
            val response = apiService.get()
            Log.d(TAG, "getRecipes: $response")
            val hits = response.hits
            hits.forEach {
                recipeNetworkEntity.add(it.recipe)
            }
        }catch (e: Exception){
            Log.d(TAG, "getRecipes error: ${e.message} ")
        }


        return networkMapper.fromEntityList(recipeNetworkEntity)
    }


}

