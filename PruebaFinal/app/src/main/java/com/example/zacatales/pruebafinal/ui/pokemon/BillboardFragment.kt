package com.example.zacatales.pruebafinal.ui.pokemon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.example.zacatales.pruebafinal.R
import com.example.zacatales.pruebafinal.databinding.FragmentBillboardBinding
import com.example.zacatales.pruebafinal.databinding.FragmentNewPokemonBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BillboardFragment : Fragment() {

    private lateinit var buttonNewPokemon: FloatingActionButton
    private lateinit var cardPokemon: CardView

    private lateinit var binding: FragmentBillboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBillboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        buttonNewPokemon.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_newPokemonFragment)
        }
    }

        private fun bind(){
            buttonNewPokemon = view?.findViewById(R.id.NewPokemonBtn) as FloatingActionButton
        }

}