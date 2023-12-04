package com.example.listcontacts.shared

import android.app.Activity
import com.de.sertsa.nds.wqer.shared.GetSharedContains
import com.de.sertsa.nds.wqer.shared.GetSharedData
import com.de.sertsa.nds.wqer.shared.GetSharedSave

class Shared(val activity: Activity) : SharedService {


    private val getSharedSave  = GetSharedSave(activity)
    private val getSharedData = GetSharedData(activity)
    private val getSharedContains = GetSharedContains(activity)




    override fun saveData(value:String, key:String) {
        getSharedSave.save(value,key)
    }



    override fun getData(key:String): String? {
        return getSharedData.getData(key)
    }
    override fun contains(key: String): Boolean {
        return getSharedContains.getContains(key)
    }
}