package com.example.seesionnavigationcomponent.cupcake

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.seesionnavigationcomponent.R
import com.example.seesionnavigationcomponent.cupcake.model.OrderViewModel
import com.example.seesionnavigationcomponent.databinding.FragmentFlavorBinding

class FlavorFragment : Fragment() {

    private var binding: FragmentFlavorBinding? = null

    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentFlavorBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner

            // Assign the view model to a property in the binding class
            viewModel = sharedViewModel

            // Assign the fragment
            flavorFragment = this@FlavorFragment
        }
    }

    fun goToNextScreen() {
        findNavController().navigate(R.id.action_flavorFragment_to_pickupFragment)
    }

    fun cancelOrder() {
        sharedViewModel.resetOrder()
//        findNavController()
//            .navigate(R.id.flavorFragment,
//                null,
//                NavOptions.Builder()
//                    .setPopUpTo(R.id.startFragment,
//                        true).build()
//            )
        findNavController().navigate(R.id.action_flavorFragment_to_startFragment)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}