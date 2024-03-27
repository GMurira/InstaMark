package com.example.insatmark.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.insatmark.R

@Composable
fun SuccessFunScreen(){
    Column(verticalArrangement = Arrangement.Center) {

        Column(
            modifier = Modifier.fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Success screen "
            )
            Text(
                text = stringResource(id = R.string.welcome),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(text = "nguyaimurira@gmail.com")
            Button(onClick = { /*TODO*/ }, modifier =  Modifier.fillMaxWidth()) {
                Text(text = stringResource(id = R.string.get_started))
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun SuccessFunScreenPreview(){
    SuccessFunScreen()
}