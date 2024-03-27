package com.example.insatmark.ui.theme.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.insatmark.R

/**
 * Contains the app common components
 */
@Composable
fun MyTextField(labelValue: Int){
    val textValue by remember{ mutableStateOf("")}
    OutlinedTextField(
        value = textValue,
        onValueChange = {},
        // label = labelValue,

    )
}
/**
 * Bottom Navigation Bar
 */
/**
 * Terms and Conditions
 */
@Composable
fun TermsAndConditions(){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = stringResource(id = R.string.TandCS))
    }
}

@Preview(showBackground = true)
@Composable
fun TermsAndConditionsPreview(){
    TermsAndConditions()
}