package com.kartheek.navigationmultimodule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kartheek.navigationmultimodule.databinding.FragmentABinding

class FragmentA : Fragment() {
    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         super.onCreateView(inflater, container, savedInstanceState)
        _binding = FragmentABinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            val directions = FragmentADirections.actionFragmentAToFragmentB()
            findNavController().navigate(directions)
        }

        binding.button1.setOnClickListener {
            val directions = FragmentADirections.actionFragmentAToFragmentAActivity2("karthik")
            findNavController().navigate(directions)
        }

        binding.button2.setOnClickListener {
            val directions = FragmentADirections.actionFragmentAToFragmentBActivity2("karthik")
            findNavController().navigate(directions)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}