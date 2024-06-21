package com.codycod.notecod.data.repositories

import android.app.Application
import com.codycod.notecod.data.database.AppDatabase
import com.codycod.notecod.data.models.MdNote
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NoteRepository(application: Application) {
    private val noteDao = AppDatabase.getInstance(application).notaDao()

    fun getNotes() = noteDao.getNotes()

    suspend fun createNote(note: MdNote) {
        withContext(Dispatchers.IO) {
            noteDao.insertNote(note)
        }
    }
}