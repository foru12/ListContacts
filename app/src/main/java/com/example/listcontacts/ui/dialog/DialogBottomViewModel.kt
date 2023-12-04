package com.example.listcontacts.ui.dialog

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.listcontacts.data.db.AppDataBaseContacts
import com.example.listcontacts.data.model.DataContacts
import com.example.listcontacts.data.repo.ContactsRepository
import kotlinx.coroutines.launch

class DialogBottomViewModel (application: Application): AndroidViewModel(application)  {


    private val repository: ContactsRepository


    init {
        val contactsDao = AppDataBaseContacts.getInstance(application, viewModelScope)!!.contactsDao()
        repository = ContactsRepository(contactsDao)
    }

    fun insert(dataContacts: DataContacts) = viewModelScope.launch {
        repository.insertContacts(dataContacts)
    }

}