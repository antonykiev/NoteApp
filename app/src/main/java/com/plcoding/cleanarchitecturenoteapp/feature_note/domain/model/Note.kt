package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.theme.*
import java.sql.Timestamp

@Entity
data class Note(
    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
) {

    companion object {
        val notesColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }

}

class InvalidNoteException(message: String): Exception(message)
