package com.example.spacedim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.spacedim.databinding.FragmentLooseBinding

class LooseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentLooseBinding>(inflater, R.layout.fragment_loose, container, false)
        binding.retryBtn.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_looseFragment_to_waintingFragment)
        }
        return binding.root
    }

}