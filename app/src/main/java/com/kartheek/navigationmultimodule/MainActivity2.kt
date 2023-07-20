package com.kartheek.navigationmultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view1) as NavHostFragment
        val navController = navHostFragment.navController
        val navGraph = navController.navInflater.inflate(R.navigation.nav_graph_main2)
        navGraph.setStartDestination(R.id.nav_fragmentb_activity2)
        navController.setGraph(navGraph, intent.extras)
    }
}


