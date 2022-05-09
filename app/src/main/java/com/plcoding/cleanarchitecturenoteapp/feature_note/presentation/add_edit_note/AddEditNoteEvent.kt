package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent() {

    data class EnterTitle(val title: String): AddEditNoteEvent()

    data class ChangeFocusTitle(val focusState: FocusState): AddEditNoteEvent()

    data class EnterContent(val title: String): AddEditNoteEvent()

    data class ChangeFocusContent(val focusState: FocusState): AddEditNoteEvent()

    data class ChangeColor(val color: Int): AddEditNoteEvent()

    object SaveNote: AddEditNoteEvent()

}
