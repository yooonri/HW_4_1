package com.example.hw_4_1.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw_4_1.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() {
        binding.buttonSend.setOnClickListener {
            val name = binding.tvName.text.toString()
            val email = binding.tvEmail.text.toString()
            val password = binding.tvPassword.text.toString()
            val user = User(name, email, password)
            findNavController().navigate(
              action = MainFragmentDirections.actionMainFragmentToSecondFragment(user.name)
            )
            findNavController().navigate(
                action = MainFragmentDirections.actionMainFragmentToSecondFragment(user.email)
            )
            findNavController().navigate(
                action = MainFragmentDirections.actionMainFragmentToSecondFragment(user.password)
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

