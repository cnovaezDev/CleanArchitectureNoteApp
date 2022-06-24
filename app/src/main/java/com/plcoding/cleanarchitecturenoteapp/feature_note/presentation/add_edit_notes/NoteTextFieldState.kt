package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_notes

data class NoteTextFieldState(
    var text: String = "",
    val hint: String = "",
    var isHintVisible: Boolean = true
) {

}