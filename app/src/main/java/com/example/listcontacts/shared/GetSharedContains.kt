package com.de.sertsa.nds.wqer.shared

import android.app.Activity
import android.preference.PreferenceManager

class GetSharedContains(val activity: Activity) {
    fun getContains(key: String): Boolean{
        val sharedPreferences = PreferenceManager
            .getDefaultSharedPreferences(activity)
        return sharedPreferences.contains(key)
    }
}