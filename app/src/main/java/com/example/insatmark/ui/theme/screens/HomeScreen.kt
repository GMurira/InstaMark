package com.example.insatmark.ui.theme.screens

import android.content.pm.ServiceInfo
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.insatmark.R
import com.example.insatmark.data.HomeServices
import com.example.insatmark.data.homeServices

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
   Column(
       modifier = Modifier
           .padding(dimensionResource(id = R.dimen.padding_medium))
           .fillMaxSize()
   ) {
       ProfileHeaderComponent()
       CardComponent()
   }
}

@Composable
fun ProfileHeaderComponent(){
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_medium))
        ){
            Text(text = stringResource(id = R.string.welcome), fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
            Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notification")
        }
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_medium))
        ){
            Text(text = stringResource(id = R.string.app_name))
            Icon(imageVector = Icons.Default.Settings, contentDescription = "Settings Icon")
        }
    }
}
@Composable
fun CardComponent(){
    Card{
        Column {
            CardIcon(serviceIcon = R.drawable.ic_launcher_foreground)
            Row {
                CardInfo(serviceName = R.string.nfc)
            }
        }
    }
}
@Composable
fun CardIcon(
    @DrawableRes serviceIcon: Int,
    modifier: Modifier = Modifier
){
    Image(
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.padding_medium))
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.Crop,
        painter = painterResource(serviceIcon),
        contentDescription = null
    )
}
@Composable
fun CardInfo(
    @StringRes serviceName: Int,
    modifier: Modifier = Modifier
){
    Text(text = stringResource(serviceName), fontSize = 25.sp)
}
@Preview(showBackground = true)
@Composable
fun   HomeScreenPreview(){
    HomeScreen()
}
