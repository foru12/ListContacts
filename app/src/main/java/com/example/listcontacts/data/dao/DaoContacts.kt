package com.example.listcontacts.data.dao

import android.provider.ContactsContract.Contacts
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.listcontacts.data.model.DataContacts
@Dao
interface DaoContacts {


    //Добавление и обновление объектов
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContacts(dataContacts: DataContacts)


    //Получение всего списка конактов
    @Query("Select * from contacts")
    fun gelAllContacts(): LiveData<List<DataContacts>>

    //Удаление оббъекта из списка контактов
    @Delete
    fun deleteContacts(dataContacts: DataContacts)

/*
    //Запрос на сортировку данных
    @Query("SELECT * FROM contacts ORDER BY name ASC")
    fun sortListContactsByName(dataContacts: DataContacts) : LiveData<List<DataContacts>>*/


}