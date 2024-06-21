package com.codycod.notecod.data.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.codycod.notecod.data.models.MdNote
import com.codycod.notecod.data.repositories.NoteRepository
import kotlinx.coroutines.launch

class NotaViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = NoteRepository(application)

    fun getNotes() = repository.getNotes()

    fun insertNote(note : MdNote){
        viewModelScope.launch {
            repository.createNote(note)
        }
    }

}