package com.example.zacatales.pruebafinal

import android.app.Application
import com.example.zacatales.pruebafinal.data.pokemones
import com.example.zacatales.pruebafinal.repositories.PokemonRepository

class PokemonReviewerApplication: Application() {
    val pokemonRepository: PokemonRepository by lazy {
        PokemonRepository(pokemones)
    }
}