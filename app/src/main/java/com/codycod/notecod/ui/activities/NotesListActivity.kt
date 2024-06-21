package com.codycod.notecod.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codycod.notecod.R
import com.codycod.notecod.data.viewmodels.NotaViewModel
import com.codycod.notecod.ui.adapters.NotesListAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NotesListActivity : AppCompatActivity() {

    private lateinit var notesListViewModel: NotaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes_list)

        notesListViewModel = ViewModelProvider(this)[NotaViewModel::class.java]

        //get items of views by id

        val rvNotes = findViewById<RecyclerView>(R.id.rv_notes_list)
        val btnNewNote = findViewById<FloatingActionButton>(R.id.f_btn_add_note)

        //set btnNewNote action for change of screen

        btnNewNote.setOnClickListener {
            startActivity(Intent(this, AddNoteActivity::class.java))
        }

        //set configuration of recyclerView of notes

        val rvNotesAdapter = NotesListAdapter()
        rvNotes.adapter = rvNotesAdapter
        rvNotes.layoutManager = GridLayoutManager(this, 2)

        //set notes to adapter

        notesListViewModel.getNotes().observe(this) { notes ->
            if (notes.isNotEmpty()) {
                notes?.let {
                    rvNotesAdapter.setNotes(notes.reversed())
                }
            } else {
                startActivity(Intent(this, AddNoteActivity::class.java))
            }
        }


    }

}