package com.example.thecocktail.presentation

import androidx.lifecycle.ViewModel
import com.example.thecocktail.domain.Cocktail
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CocktailViewModel @Inject constructor() : ViewModel() {
    val cocktail = Cocktail("1", "1", "1", "1", false, emptyList())
}