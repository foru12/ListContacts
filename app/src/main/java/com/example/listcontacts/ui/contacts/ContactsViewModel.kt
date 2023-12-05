package com.example.listcontacts.ui.contacts

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.listcontacts.data.db.AppDataBaseContacts
import com.example.listcontacts.data.model.DataContacts
import com.example.listcontacts.data.repo.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: ContactsRepository
    val allContacts: LiveData<List<DataContacts>>

    init {
        val contactsDao = AppDataBaseContacts.getInstance(application, viewModelScope)!!.contactsDao()
        repository = ContactsRepository(contactsDao)
        allContacts = repository.allContacts
    }

    fun delete(dataContacts: DataContacts){
        repository.deleteContacts(dataContacts)
    }
}