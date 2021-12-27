package com.example.spacedim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.spacedim.databinding.FragmentCreateRoomBinding

class CreateRoomFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCreateRoomBinding>(inflater, R.layout.fragment_create_room, container, false)
        binding.joinRoom.setOnClickListener { view : View -> view.findNavController().navigate(R.id.action_createRoomFragment_to_waintingFragment) }
        return binding.root
    }

}