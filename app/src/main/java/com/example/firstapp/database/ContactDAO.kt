package com.example.firstapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import chimjan.xkalux.mobilehomework_firstapp.database.Contact

@Dao
interface ContactDAO {
    @Insert
    fun insert(contact: Contact)
    @Query("SELECT * from contact_table")
    fun get(): LiveData<List<Contact>>
}