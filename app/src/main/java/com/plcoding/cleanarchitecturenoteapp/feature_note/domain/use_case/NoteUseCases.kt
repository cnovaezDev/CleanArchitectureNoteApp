package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import javax.inject.Inject

data class NoteUseCases (
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
