package com.example.spacedim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.spacedim.databinding.FragmentGameBinding

class GameFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater, R.layout.fragment_game, container, false)
        binding.fakeLooseBtn.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_gameFragment_to_looseFragment)
        }
        binding.fakeWinBtn.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_gameFragment_to_winFragment)
        }
        return binding.root
    }
}