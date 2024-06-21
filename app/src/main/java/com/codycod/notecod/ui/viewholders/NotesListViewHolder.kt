package com.codycod.notecod.ui.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codycod.notecod.R
import com.codycod.notecod.data.models.MdNote

class NotesListViewHolder(inflater: LayoutInflater, viewGroup: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_note, viewGroup,false)) {

    //find items by id
    private val titleNote = itemView.findViewById<TextView>(R.id.tv_title_note)
    private val contentNote = itemView.findViewById<TextView>(R.id.tv_content_note)
    private val timeNote = itemView.findViewById<TextView>(R.id.tv_time_note)


    fun bindNote(note: MdNote) {
        titleNote.text = note.title
        contentNote.text = note.content
        timeNote.text = note.date
    }


}