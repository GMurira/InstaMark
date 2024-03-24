package com.example.insatmark.ui.theme.screens

import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable

/**
 * Contains the app common components
 */
@Composable
fun InputCommon(){
    OutlinedTextField(
        value = "",
        onValueChange = {},
        singleLine = true,

    )
}