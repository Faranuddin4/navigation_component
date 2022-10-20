package com.example.seesionnavigationcomponent.homescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.seesionnavigationcomponent.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class SafeArgs : Fragment() {
    private val args: SafeArgsArgs by navArgs<SafeArgsArgs>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_safe_args, container, false)
        val personParcel = args.person
        view.findViewById<TextView>(R.id.tv_person_data).text = "My Name is: ${personParcel.name}\nI\'m ${personParcel.age} years old."
        view.findViewById<TextView>(R.id.detail).text = "${personParcel.name} is a talented and passionate Software Developer with a strong background in Mobile development (Android) \n He loves engaging with other Android Developers and enjoys working with them."
        return view
    }

}