package com.example.seesionnavigationcomponent.homescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.seesionnavigationcomponent.R
import com.example.seesionnavigationcomponent.homescreen.model.Person

class About : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        view.findViewById<Button>(R.id.btn_list_graph).setOnClickListener {
            findNavController().navigate(R.id.list)
//            Navigation.findNavController(it).navigate(R.id.action_global_leaderboard)

        }
        view.findViewById<Button>(R.id.btn_register_graph).setOnClickListener {
           findNavController().navigate(R.id.form)
        }
        view.findViewById<Button>(R.id.btn_order_graph).setOnClickListener {
            findNavController().navigate(R.id.nav_order_cup_cake)
        }
        view.findViewById<Button>(R.id.btn_data_passing).setOnClickListener {
            val person = Person("Ali", 19)
            val bundle = bundleOf("data" to person)
            findNavController().navigate(R.id.action_aboutScreen_to_dataFragment, bundle)
        }

        view.findViewById<Button>(R.id.btn_data_passing_using_safe_args).setOnClickListener {
            val person = Person("Hamza Shahid", 19)
            val action = AboutDirections.actionAboutScreenToSafeArgs(person)
            findNavController().navigate(action)
        }
        return view
    }
}
