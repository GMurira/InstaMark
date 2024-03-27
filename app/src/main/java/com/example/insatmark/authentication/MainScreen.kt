package com.example.insatmark.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.insatmark.DestinationScreen
import com.example.insatmark.FireBaseViewModel
import com.example.insatmark.R

@Composable
fun MainScreen(navController: NavController, vm: FireBaseViewModel){
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Main ScreenImage",
        contentScale = ContentScale.Crop
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = stringResource(id = R.string.welcome),
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.height(80.dp))
        Box (
            modifier = Modifier.clip(RoundedCornerShape(50.dp))
        ){
            Button(onClick = {
                             navController.navigate(DestinationScreen.SignUp.route)
                             }, colors = ButtonDefaults.buttonColors(
                Color.Transparent
            ), modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(id = R.string.signup),
                    color = Color.Black,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Button(onClick = {
                    navController.navigate(DestinationScreen.SignUp.route)
                }, colors = ButtonDefaults.buttonColors(
                    Color.Transparent
                ), modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = stringResource(id = R.string.orlogin),
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
            }
        }
    }
}}