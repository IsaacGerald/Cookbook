package com.example.myapplication.data.cache

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RecipeDao {

    @Query("SELECT * FROM recipe_table")
    suspend fun getRecipes(): List<RecipeCacheEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecipe(recipeCacheEntity: RecipeCacheEntity)
}