package com.example.zacatales.pruebafinal.ui.pokemon

import android.text.Spannable.Factory
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.zacatales.pruebafinal.PokemonReviewerApplication
import com.example.zacatales.pruebafinal.data.model.PokemonModel
import com.example.zacatales.pruebafinal.repositories.PokemonRepository

class PokemonViewModel(private val repository: PokemonRepository) : ViewModel() {
    var name = MutableLiveData(" ")
    var category = MutableLiveData(" ")
    var number = MutableLiveData(" ")
    var rating = MutableLiveData(" ")
    var status = MutableLiveData(" ")

    fun getPokemones() = repository.getPokemones()

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as PokemonReviewerApplication
                PokemonViewModel(app.pokemonRepository)
            }
        }
        const val POKEMON_CREATE = "Pokemon created"
        const val WRONG_INFORMATION = "wrong information"
        const val INACTIVE = ""
    }

    fun createPokemon(){
        if(!validateData()){
            status.value = WRONG_INFORMATION
            return
        }
        val pokemon = PokemonModel(
            name.value !!,
            category.value!!,
            number.value !!,
            rating.value!!
        )
        addPokemones(pokemon)
        clearData()

        status.value = POKEMON_CREATE
    }

    private fun validateData(): Boolean {
        when {
            name.value.isNullOrEmpty() -> return false
            category.value.isNullOrEmpty() -> return false
            number.value.isNullOrEmpty() -> return false
            rating.value.isNullOrEmpty() -> return false
        }
        return true
    }

    fun clearData() {
        name.value = ""
        category.value = ""
        number.value = ""
        rating.value = ""

    }

    fun clearStatus() {
        status.value = INACTIVE
    }

    fun setSelectedPokemon(pokemon: PokemonModel){
        name.value = pokemon.name
        category.value = pokemon.category
        number.value = pokemon.number
        rating.value = pokemon.rating
    }

    fun addPokemones(pokemon: PokemonModel) = repository.addPokemones(pokemon)

}