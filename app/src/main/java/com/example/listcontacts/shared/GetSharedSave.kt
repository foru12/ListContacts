package com.de.sertsa.nds.wqer.shared

import android.app.Activity
import android.preference.PreferenceManager
import android.util.Log

class GetSharedSave(val activity: Activity) {
    fun save(value:String, key:String){
        val sharedPreferences = PreferenceManager
            .getDefaultSharedPreferences(activity)
        val editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.apply()
        Log.d("Shared", "Данные сохранены -->   " + key + "  :  " + value)
    }
}