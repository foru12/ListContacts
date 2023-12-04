package com.example.listcontacts.ui.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.listcontacts.data.model.DataContacts
import com.example.listcontacts.databinding.FragmentAddDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class DialogBottom() : BottomSheetDialogFragment() {

    private var strName = ""
    private var strNumber = ""
    private var strLogo = "app//"

    constructor(dataContacts: DataContacts) : this() {
        strName = dataContacts.name
        strLogo = dataContacts.logoAvatar
        strNumber = dataContacts.number
    }

    private var _binding: FragmentAddDialogBinding? = null


    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dialogViewModel =
            ViewModelProvider(this).get(DialogBottomViewModel::class.java)
        _binding = FragmentAddDialogBinding.inflate(inflater, container, false)
        val root: View = binding.root



        /*  Glide
               .with(activity)
               .load(contacts.logoAvatar)
               .centerCrop()
               .into(imAvatarLogo);
*/
        binding.edName.setText(strName)
        binding.edNumber.setText(strNumber)



        binding.btnAddContact.setOnClickListener {

            strName = binding.edName.text.toString()
            strNumber = binding.edNumber.text.toString()
            //Добавление фото
            strLogo = "app//"
            if (strName != "" && strNumber != "" && strLogo != ""){
                dialogViewModel.insert(
                    DataContacts(
                        0, strLogo, strName, strNumber
                    )
                )
            }
            dialog!!.dismiss()
        }



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}