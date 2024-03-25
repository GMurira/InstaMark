package com.example.insatmark.ui.theme.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
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
@Composable
fun ButtonCommon(
    onBttonClicked: () -> Unit,
    buttonText: String
){
    Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
        Text(text = buttonText)
    }
}
@Preview
@Composable
fun ButtonCommonPreview(){
    ButtonCommon(onBttonClicked = {}, buttonText = "Click me")
}
@Preview(showBackground = true)
@Composable
fun TermsAndConditionsPreview(){
    TermsAndConditions()
}