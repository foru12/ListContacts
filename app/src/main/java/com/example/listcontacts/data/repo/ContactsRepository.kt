package com.example.listcontacts.data.repo

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.listcontacts.data.dao.DaoContacts
import com.example.listcontacts.data.model.DataContacts

class ContactsRepository(
    private val daoContacts: DaoContacts,
) {
    val allContacts: LiveData<List<DataContacts>> = daoContacts.gelAllContacts()


    fun insertContacts(dataContacts: DataContacts) {
        daoContacts.insertContacts(dataContacts)
    }

    fun deleteContacts(dataContacts: DataContacts){
        daoContacts.deleteContacts(dataContacts)
    }


    /*fun sortListContactsByName(dataContacts: DataContacts): LiveData<List<DataContacts>>{
        return daoContacts.sortListContactsByName(dataContacts)
    }*/
}