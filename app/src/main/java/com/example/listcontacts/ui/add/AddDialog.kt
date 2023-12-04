package com.example.listcontacts.ui.add

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.listcontacts.R
import com.example.listcontacts.databinding.FragmentContactsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class AddDialog   : BottomSheetDialogFragment()  {

    private var _binding: FragmentContactsBinding? = null


    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentContactsBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}