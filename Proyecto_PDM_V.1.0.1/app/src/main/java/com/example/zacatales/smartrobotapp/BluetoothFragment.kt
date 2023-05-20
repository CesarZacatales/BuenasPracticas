package com.example.zacatales.smartrobotapp

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BluetoothFragment : Fragment() {

    private lateinit var btnToControllers: FloatingActionButton
    private lateinit var btnToWelcome: FloatingActionButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bluetooth, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bin()
        btnToWelcome.setOnClickListener{
            it.findNavController().navigate(R.id.action_bluetoothFragment_to_welcomeFragment)
        }
        btnToControllers.setOnClickListener {
            activity?.apply {
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                it.findNavController().navigate(R.id.action_bluetoothFragment_to_controllersFragment2)

            }

        }
    }

    fun bin(){
        btnToWelcome = view?.findViewById(R.id.action_to_previus) as FloatingActionButton
        btnToControllers = view?.findViewById(R.id.action_to_controllers) as FloatingActionButton
    }
}