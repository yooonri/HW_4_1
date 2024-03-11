package com.example.hw_4_1.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.hw_4_1.R
import com.example.hw_4_1.databinding.FragmentMainBinding
import com.example.hw_4_1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {


    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root

        val userInfo = args.user
        binding.tvName.text = userInfo.name
        binding.tvEmail.text = userInfo.email
        binding.tvPassword.text = userInfo.password
    return view
}
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}