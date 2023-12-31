package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository


// Step 8
class DeleteNote(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note){
        return repository.deleteNote(note)
    }
}