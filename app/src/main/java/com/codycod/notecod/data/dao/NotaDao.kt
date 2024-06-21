package com.codycod.notecod.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.codycod.notecod.data.models.MdNote

@Dao
interface NotaDao {

    @Query("SELECT *  FROM notes")
    fun getNotes(): LiveData<List<MdNote>>

    @Insert
    fun insertNote(note: MdNote)

    @Update
    fun updateNote(note: MdNote)

    @Delete
    fun deleteNote(note: MdNote)
}
