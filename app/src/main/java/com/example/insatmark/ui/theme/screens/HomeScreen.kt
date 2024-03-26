package com.example.insatmark.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.insatmark.R
import com.example.insatmark.data.HomeServices
import com.example.insatmark.data.homeServices

/**
 * Application Home Screen
 */
@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    val mediumPadding = dimensionResource(id = R.dimen.padding_medium)
    Scaffold {
        LazyColumn(contentPadding = it){
            items(homeServices) { NfcAndQRComponent(homeServices = it) }
        }
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
 * Bottom Navigation Bar
 */
@Composable
fun BottomNavigationComponent(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.padding_medium)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(imageVector = Icons.Default.Home, contentDescription = "Bottom navigation home icon")
        Icon(imageVector = Icons.Default.List, contentDescription = "Bottom navigation list icon")
        Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Bottom navigation home icon")
    }
}
/**
 * Bottom Navigation Componet Preview
 */
@Preview(showBackground = true)
@Composable
fun BottomNavigationComponentPreview(){
    BottomNavigationComponent()
}
/**
 * Search bar Component
 */
@Composable
fun SearchBarComponent(){
    Column {
        Text(
            text = stringResource(id = R.string.search),
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif
        )
    }
}
/**
 * Search Bar Composable preview
 */
//@Preview(showBackground = true)
//@Composable
//fun SearBarComponent(){
//    SearchBarComponent()
//}
/**
 * Choose mode of student registration
 */
@Composable
fun NfcAndQRComponent(homeServices: HomeServices){
  Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
      Text(
          text = stringResource(id = R.string.attendancemode),
          textAlign = TextAlign.Center,
          fontFamily = FontFamily.SansSerif
      )
          ElevatedCard(
              colors = CardDefaults.cardColors(
                  containerColor = MaterialTheme.colorScheme.surfaceVariant,
              ),
              modifier = Modifier
                  .size(width = 140.dp, height = 100.dp),
              elevation = CardDefaults.cardElevation(
                  defaultElevation = 6.dp
              )
          ) {
           Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()){
               Image(painter = painterResource(homeServices.serviceIcon), contentDescription = "home services icon")
               Text(text = stringResource(homeServices.name))
           }
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