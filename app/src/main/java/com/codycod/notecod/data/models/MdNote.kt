package com.codycod.notecod.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class MdNote(
    val title: String,
    val content: String,
    val date: String,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
