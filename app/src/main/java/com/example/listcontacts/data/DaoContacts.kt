package com.example.listcontacts.data

import android.provider.ContactsContract.Contacts
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.listcontacts.data.model.DataContacts

interface DaoContacts {


    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContacts(dataContacts: DataContacts)


}