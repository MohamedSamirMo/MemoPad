package com.example.notesapp.di

import android.content.Context
import androidx.room.Room
import com.example.notesapp.database.NoteDao
import com.example.notesapp.database.NoteDatabase

import dagger.Module

import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

import javax.inject.Singleton
@InstallIn(SingletonComponent::class)
@Module
object Module {


    @Singleton
    @Provides
    fun getMyDatabase(@ApplicationContext context: Context) :NoteDatabase{
        return Room.databaseBuilder(
            context,
            NoteDatabase::class.java,
            "note_db"
        ).build()
    }
    @Singleton
    @Provides
    fun getMyDao(myDatabase: NoteDatabase):NoteDao{
        return myDatabase.getNoteDao()
    }
}