package com.example.noteappcompose.feature_note.domain.use_case

import com.example.noteappcompose.feature_note.domain.model.Note
import com.example.noteappcompose.feature_note.domain.repository.NoteRepository
import javax.inject.Inject

class GetNote @Inject constructor(
    private val repository: NoteRepository
) {


    suspend operator fun invoke(id: Int): Note? {
        return repository.getNotesById(id)
    }
}