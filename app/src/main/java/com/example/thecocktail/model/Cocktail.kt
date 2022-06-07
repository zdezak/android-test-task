package com.example.thecocktail.model

data class Cocktail(
    val id: String,
    val name: String,
    val image: String,
    val category: String,
    val favorite: Boolean,
    val ingredients: List<String>
)

