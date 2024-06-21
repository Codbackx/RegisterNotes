package com.codycod.notecod.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codycod.notecod.data.models.MdNote
import com.codycod.notecod.ui.viewholders.NotesListViewHolder

class NotesListAdapter : RecyclerView.Adapter<NotesListViewHolder>() {

    private var listNotes = emptyList<MdNote>()

    fun setNotes(notes : List<MdNote>) {
        this.listNotes = notes
        this.notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesListViewHolder =
        NotesListViewHolder(LayoutInflater.from(parent.context), parent)

    override fun getItemCount(): Int = listNotes.size

    override fun onBindViewHolder(holder: NotesListViewHolder, position: Int) =
        holder.bindNote(listNotes[position])
}