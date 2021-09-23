package com.example.myapplication.presentation.ui.recipe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentRecipeBinding


class RecipeFragment : Fragment(R.layout.fragment_recipe) {
   private lateinit var binding: FragmentRecipeBinding
   private val  viewModel: RecipeViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRecipeBinding.bind(view)

            viewModel.getRecipes()
    }
}