package com.example.listcontacts.ui.contacts

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.listcontacts.data.model.DataContacts
import com.example.listcontacts.databinding.FragmentContactsBinding
import com.example.listcontacts.ui.add.AddDialog

class ContactsFragment : Fragment() {

    private var _binding: FragmentContactsBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val contactsViewModel =
            ViewModelProvider(this).get(ContactsViewModel::class.java)
        _binding = FragmentContactsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val adapter = AdapterContacts(requireActivity())
        binding.rcContacts.adapter = adapter



        binding.btnAdd.setOnClickListener {
            val dialog = AddDialog()
            dialog.show(requireActivity().supportFragmentManager,dialog.tag)



            contactsViewModel.insert(DataContacts(0, "", "uifgbniueg", "843975803"))
        }

        contactsViewModel.allContacts.observe(viewLifecycleOwner) {
            Log.d("DataBase", it.toString())
            adapter.setСontacts(it)
        }





        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}