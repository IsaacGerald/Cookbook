package com.example.myapplication.domain.model

data class Recipe(
    val id: Int,
    val calories: Double,
    val cautions: List<String>,
    val cuisineType: List<String>,
    val dietLabels: List<String>,
    val dishType: List<String>,
    val healthLabels: List<String>,
    val image: String,
    val ingredientLines: List<String>,
    val ingredients: List<Ingredient>,
    val label: String,
    val mealType: List<String>,
    val shareAs: String,
    val source: String,
    val totalTime: Double,
    val totalWeight: Double,
    val uri: String,
    val url: String,
    val yield: Double
)

data class Ingredient(
    val foodCategory: String,
    val foodId: String,
    val image: Any,
    val text: String,
    val weight: Double
)