package com.example.notesapp.repository

import com.example.notesapp.database.NoteDatabase
import com.example.notesapp.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(private val db:NoteDatabase) {
    suspend fun insertNote(note: Note)=db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note)=db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note)=db.getNoteDao().updateNote(note)
    fun getAllNotes()=db.getNoteDao().getAllNotes()
    fun searchNote(query: String?)=db.getNoteDao().searchNotes(query)


}