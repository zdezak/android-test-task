package com.example.thecocktail.presentation

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.thecocktail.R
import com.example.thecocktail.databinding.FragmentCocktailBinding

class CocktailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel = CocktailViewModel()
        val binding = FragmentCocktailBinding.inflate(inflater, container, false)

        binding.cocktailId.text = viewModel.cocktail.id
        binding.cocktailName.text = viewModel.cocktail.name
        binding.cocktailCategory.text = viewModel.cocktail.category
        binding.cocktailImage.setImageURI(Uri.parse(viewModel.cocktail.image))
        binding.cocktailFavorite.setImageURI(Uri.parse(viewModel.cocktail.category))

        binding.switchRefresh.setOnRefreshListener {
            findNavController().navigate(R.id.action_CocktailFragment_to_LoadingFragment)
        }

        return binding.root

    }
}