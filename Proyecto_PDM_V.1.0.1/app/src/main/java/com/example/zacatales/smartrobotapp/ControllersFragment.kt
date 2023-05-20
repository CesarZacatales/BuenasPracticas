package com.example.zacatales.smartrobotapp

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton



class ControllersFragment : Fragment() {

    private lateinit var btnToBack: FloatingActionButton
    private lateinit var btnToBluetooth: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_controllers, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bin()
        btnToBack.setOnClickListener {
            activity?.apply {
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                it.findNavController().navigate(R.id.action_controllersFragment2_to_welcomeFragment)
            }
        }
        btnToBluetooth.setOnClickListener {

            activity?.apply {
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                it.findNavController().navigate(R.id.action_controllersFragment2_to_bluetoothFragment)
            }
        }

    }
    fun bin(){
        btnToBack = view?.findViewById(R.id.action_to_previus_controllerFragment) as FloatingActionButton
        btnToBluetooth = view?.findViewById(R.id.action_to_bluetooth_ControllerFragment) as FloatingActionButton
    }


}