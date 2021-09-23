package com.example.myapplication.data.network.model

import com.example.myapplication.domain.model.*
import com.example.myapplication.domain.model.Ingredient

data class RecipeResponse(
    val _links: Links,
    val count: Int,
    val from: Int,
    val hits: List<Hit>,
    val to: Int
)

data class Hit(
    val _links: LinksX,
    val recipe: RecipeNetworkEntity
)

data class LinksX(
    val self: Self
)

data class Self(
    val href: String,
    val title: String
)

data class RecipeNetworkEntity(
    val calories: Double,
    val cautions: List<String>,
    val cuisineType: List<String>,
    val dietLabels: List<String>,
    val dishType: List<String>,
    val healthLabels: List<String>,
    val image: String,
    val ingredientLines: List<String>,
    val ingredients: List<IngredientNetworkEntity>,
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


data class Links(
    val next: Next
)

data class Next(
    val href: String,
    val title: String
)

data class IngredientNetworkEntity(
    val foodCategory: String,
    val foodId: String,
    val image: Any,
    val text: String,
    val weight: Double
)