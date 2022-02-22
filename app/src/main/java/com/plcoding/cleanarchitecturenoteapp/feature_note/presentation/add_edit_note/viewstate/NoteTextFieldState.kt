package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note.viewstate

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)