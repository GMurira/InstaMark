package com.example.insatmark.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.insatmark.R

/**
 * SignUp Screen
 */
@Composable
fun SignUpScreen(){
    val mediumPadding = dimensionResource(id = R.dimen.padding_medium)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(mediumPadding),
        verticalArrangement = Arrangement.spacedBy(mediumPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(value = "", onValueChange = {})
        OutlinedTextField(value = "" , onValueChange = {})
        OutlinedTextField(value = "", onValueChange = {})
        Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(id = R.string.signup))
        }
        Divider(thickness = 4.dp)
        Text(text = stringResource(id = R.string.or))
        Text(text = stringResource(id = R.string.orlogin))
    }
}

/**
 * Sign up screen preview
 */
@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview(){
    SignUpScreen()
}