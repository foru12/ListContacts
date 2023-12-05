package com.example.listcontacts.data.db

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.listcontacts.data.dao.DaoContacts
import com.example.listcontacts.data.helper.Converter
import com.example.listcontacts.data.model.DataContacts
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [DataContacts::class], version = 1)
@TypeConverters(Converter::class)
abstract class AppDataBaseContacts  : RoomDatabase() {

    abstract fun contactsDao(): DaoContacts


    private class ContactsDatabaseCallback(private val scope: CoroutineScope) : RoomDatabase.Callback() {
        @RequiresApi(Build.VERSION_CODES.O)
        override fun onOpen(db: SupportSQLiteDatabase) {
            super.onOpen(db)
            INSTANCE?.let { database ->
                scope.launch {
                    populateDatabaseContacts(database.contactsDao())
                }
            }
        }


        fun populateDatabaseContacts(cantactsDao: DaoContacts) {
            val listContacts = arrayListOf<DataContacts>(
                DataContacts(
                    0,
                    "app//sheme",
                    "kostya",
                    "89854657678"
                )

            )
            for (i in listContacts) {
                cantactsDao.insertContacts(i)
            }

        }
    }

    companion object {
        private var INSTANCE: AppDataBaseContacts? = null

        fun getInstance(
            context: Context,
            scope: CoroutineScope
        ): AppDataBaseContacts? {

            if (INSTANCE == null) {
                synchronized(AppDataBaseContacts::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDataBaseContacts::class.java, "contacts.db"
                    ).allowMainThreadQueries()
                        .addCallback(ContactsDatabaseCallback(scope))
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

}