package com.example.zacatales.pruebafinal.ui.pokemon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zacatales.pruebafinal.R
import com.example.zacatales.pruebafinal.databinding.FragmentPokemonBinding


class PokemonFragment : Fragment() {

    private lateinit var binding: FragmentPokemonBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPokemonBinding.inflate(inflater, container, false)
        return binding.root
    }
}