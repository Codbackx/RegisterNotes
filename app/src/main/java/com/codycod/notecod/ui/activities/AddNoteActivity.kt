package com.codycod.notecod.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.codycod.notecod.R
import com.codycod.notecod.data.models.MdNote
import com.codycod.notecod.data.viewmodels.NotaViewModel
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class AddNoteActivity : AppCompatActivity() {


    private lateinit var viewModel: NotaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_note)

        viewModel = ViewModelProvider(this)[NotaViewModel::class]

        //get items of view by id

        val titleNote = findViewById<EditText>(R.id.et_title_note)
        val contentNote = findViewById<EditText>(R.id.et_content_note)
        val btnRegister = findViewById<Button>(R.id.btn_register_note)

        //set event to btnRegister
        btnRegister.setOnClickListener {
            try {
                val note = MdNote(
                    title = titleNote.text.toString(),
                    content = contentNote.text.toString(),
                    date = this.getLocalTime()
                )
                viewModel.insertNote(note)
                startActivity(Intent(this, NotesListActivity::class.java))
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }


    }

    private fun getLocalTime() : String {
        val localTime = LocalTime.now()
        val timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH:mm"))
        return timeFormat.toString()
    }

}