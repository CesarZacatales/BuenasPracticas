package com.example.zacatales.pruebafinal.data

import com.example.zacatales.pruebafinal.data.model.PokemonModel

val pokemon1_name = "Pikachu"
val pokemon1_category = "Electric Mouse"
val pokemon1_number = "25"
val pokemon1_rating = "9.2"

val pokemon2_name = "Bulbasaur"
val pokemon2_category = "Seed"
val pokemon2_number = "1"
val pokemon2_rating = "8.7"

val pokemon3_name = "Charizard"
val pokemon3_category = "Flame"
val pokemon3_number = "6"
val pokemon3_rating = "9.8"


var pokemones = mutableListOf(
    PokemonModel(pokemon1_name, pokemon1_category, pokemon1_number, pokemon1_rating),
    PokemonModel(pokemon2_name, pokemon2_category, pokemon2_number, pokemon2_rating),
    PokemonModel(pokemon3_name, pokemon3_category, pokemon3_number, pokemon3_rating)
)