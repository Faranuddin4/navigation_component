package com.example.seesionnavigationcomponent.homescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.seesionnavigationcomponent.R
import com.example.seesionnavigationcomponent.homescreen.model.Person

class DataFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_data, container, false)
        val param1 = requireArguments().get("data") as Person
        view.findViewById<TextView>(R.id.tv_value_1).text = "Name is ${param1.name}"
        view.findViewById<TextView>(R.id.tv_value_2).text = "Age is ${param1.age}"
        return view
    }

}