package com.example.insatmark.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.insatmark.R

/**
 * Application Home Screen
 */
@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column(modifier = Modifier.fillMaxSize()) {
        NfcAndQRComponent()
    }
}

/**
 * Top App Bar
 */
@Composable
fun TopAppBar(){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(dimensionResource(id = R.dimen.padding_medium)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween)
    {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow Back Button")
        Text(text = stringResource(id = R.string.home))
        Icon(imageVector = Icons.Default.Menu, contentDescription = "Top app bar Menu Icons")
    }
}

/**
 * Choose mode of student registration
 */
@Composable
fun NfcAndQRComponent(){
    Row {
        OutlinedCard {

        }
        OutlinedCard {

        }
    }
}
@Preview(showBackground = true)
@Composable
fun TopAppBarPreview(){
    TopAppBar()
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}