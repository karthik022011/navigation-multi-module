package com.kartheek.navigationmultimodule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.kartheek.navigationmultimodule.databinding.FragmentbActivity2Binding

class FragmentBActivity2 : Fragment() {
    private var _binding: FragmentbActivity2Binding? = null
    private val binding get() = _binding!!

    private val safeArgs:FragmentBActivity2Args by navArgs<FragmentBActivity2Args>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         super.onCreateView(inflater, container, savedInstanceState)
        _binding = FragmentbActivity2Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val value = safeArgs.name
        binding.textView1.text = value
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}