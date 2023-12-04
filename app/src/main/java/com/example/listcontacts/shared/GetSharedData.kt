package com.de.sertsa.nds.wqer.shared

import android.app.Activity
import android.preference.PreferenceManager
import android.util.Log

class GetSharedData(val activity: Activity) {



    fun getData(key:String): String?{
        val sharedPreferences = PreferenceManager
            .getDefaultSharedPreferences(activity)
        Log.d("Shared", "Полученные данные -->   " + key + "  :  " + sharedPreferences.getString(key, ""))
        return sharedPreferences.getString(key, "")
    }
}