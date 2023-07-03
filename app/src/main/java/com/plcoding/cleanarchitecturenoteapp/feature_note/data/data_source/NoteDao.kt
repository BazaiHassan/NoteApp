package com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

// Step 2
@Dao
interface NoteDao {

    // This function will get all notes from database. This is like apiService exactly.
    // But there we had links to our remote database
    @Query("SELECT * FROM note") // The note will be the name of database
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id=:id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insetNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

}