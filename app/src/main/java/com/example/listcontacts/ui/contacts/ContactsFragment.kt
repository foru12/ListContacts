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
import com.example.listcontacts.ui.dialog.DialogBottom

class ContactsFragment : Fragment() {

    private var _binding: FragmentContactsBinding? = null
    private val binding get() = _binding!!
    private var flagClickDelete = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val contactsViewModel =
            ViewModelProvider(this).get(ContactsViewModel::class.java)
        _binding = FragmentContactsBinding.inflate(inflater, container, false)
        val root: View = binding.root




        flagClickDelete = true

        binding.btnChoice.setOnClickListener {
            if (flagClickDelete) {
                binding.checkboxSelectAll.visibility = View.VISIBLE
                binding.btnAdd.visibility = View.GONE
                binding.llContainerBtn.visibility = View.VISIBLE
                flagClickDelete = false;
            } else {
                binding.checkboxSelectAll.visibility = View.GONE
                binding.btnAdd.visibility = View.VISIBLE
                binding.llContainerBtn.visibility = View.GONE
                flagClickDelete = true;
            }
        }

        val adapter = AdapterContacts()
        binding.rcContacts.adapter = adapter



        binding.btnAdd.setOnClickListener {
            val dialog = DialogBottom()
            dialog.show(requireActivity().supportFragmentManager,dialog.tag)
        }

        contactsViewModel.allContacts.observe(viewLifecycleOwner) {
            Log.d("DataBase", it.toString())
            adapter.setСontacts(it)
        }


        adapter.setOnContactsClickListener(object :AdapterContacts.OnItemClickListener{
            override fun onContactsClick(contacts: DataContacts) {
                //contactsViewModel.delete(contacts)

                Log.d("DATA",contacts.toString())
                val dialog = DialogBottom(contacts)
                dialog.show(requireActivity().supportFragmentManager,dialog.tag)
            }
        })



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}