package com.example.insatmark.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.insatmark.FireBaseViewModel
import com.example.insatmark.R

@Composable
fun SignUpScreen(navController: NavController, vm : FireBaseViewModel){
    val empty by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("")}
    val password by remember { mutableStateOf("")}
    val cpassword by remember { mutableStateOf("")}
    val passwordVisibility by remember { mutableStateOf(false)}
    val cpasswordVisibility by remember { mutableStateOf(false)}
    val erroeE by remember { mutableStateOf(false)}
    val erroeP by remember { mutableStateOf(false)}
    val erroeCp by remember { mutableStateOf(false)}
    val erroeC by remember { mutableStateOf(false)}
    val pLength by remember { mutableStateOf(false)}
    
    
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        if(vm.inProgress.value){
            CircularProgressIndicator()
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 150.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = stringResource(id = R.string.signup),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.height(50.dp))
        if (erroeE){
            Text(
                text = "Enter your Email",
                color = Color.Red,
                modifier = Modifier.padding(end = 100.dp)
            )
        }
        TextField(
            value = email,
            onValueChange = {
                            email = it
                            },
            label = {
                Text(text = stringResource(id = R.string.email))
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "E-mail leading Icon"
                )
            },
            trailingIcon = {
                if(email.isNotEmpty()){
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Trailing Icon Close Button",
                        Modifier.clickable {  email = empty}
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next
            ), singleLine = true,
            textStyle = TextStyle(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            ),
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .width(300.dp)
                .height(60.dp),

        )
    }
}