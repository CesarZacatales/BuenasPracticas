package com.example.zacatales.pruebafinal.ui.pokemon

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.zacatales.pruebafinal.R
import com.example.zacatales.pruebafinal.databinding.FragmentNewPokemonBinding


class NewPokemonFragment : Fragment() {

     private val pokemonViewModel: PokemonViewModel by activityViewModels {
        PokemonViewModel.Factory
    }

    private lateinit var binding:FragmentNewPokemonBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNewPokemonBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
        observeStatus()
    }

    private fun setViewModel(){
        binding.viewmodel = pokemonViewModel
    }
    private fun observeStatus(){
        pokemonViewModel.status.observe(viewLifecycleOwner) {
                status -> when {
            status.equals(PokemonViewModel.WRONG_INFORMATION) -> {
                Log.d(APP_TAG, status)
                pokemonViewModel.clearStatus()
            }
            status.equals(PokemonViewModel.POKEMON_CREATE) -> {
                Log.d(APP_TAG, status)
                Log.d(APP_TAG, pokemonViewModel.getPokemones().toString())

                pokemonViewModel.clearStatus()
                findNavController().popBackStack()
            }
        }
        }
    }
    companion object{
        const val APP_TAG = "APP TAG"
    }
}