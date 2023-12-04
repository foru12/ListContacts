package com.example.listcontacts.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "contacts")
data class DataContacts(
    @PrimaryKey(autoGenerate = true) val id:Int,
    val logoAvatar: String,
    val name: String,
    val number: String,
)