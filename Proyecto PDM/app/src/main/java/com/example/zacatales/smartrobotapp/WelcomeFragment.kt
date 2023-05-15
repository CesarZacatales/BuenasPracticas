package com.example.zacatales.smartrobotapp

import android.os.Bundle
import android.os.ProxyFileDescriptorCallback
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class WelcomeFragment : Fragment() {

    private lateinit var btnToControllers: FloatingActionButton
    private lateinit var btnToBluetooth: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //FOR THE APP CLOSE ALONE IN MAIN FRAGMENT
        requireActivity().onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                requireActivity().finish()
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bin()
        btnToBluetooth.setOnClickListener{
            it.findNavController().navigate(R.id.action_welcomeFragment_to_bluetoothFragment)
        }
        btnToControllers.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeFragment_to_controllersActivity)
        }
    }

    fun bin(){
        btnToBluetooth = view?.findViewById(R.id.action_to_bluetooth) as FloatingActionButton
        btnToControllers = view?.findViewById(R.id.action_to_controllers) as FloatingActionButton
    }
}
