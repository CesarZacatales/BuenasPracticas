package com.example.zacatales.pruebafinal.repositories

import com.example.zacatales.pruebafinal.data.model.PokemonModel

class PokemonRepository(private val pokemones: MutableList<PokemonModel>) {

    fun getPokemones() = pokemones

    fun addPokemones(pokemon: PokemonModel) = pokemones.add(0, pokemon)
}