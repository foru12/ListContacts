package com.example.listcontacts.shared

interface SharedService {
    fun getData(key:String): String?
    fun saveData(value:String, key:String)
    fun contains(key:String): Boolean
}