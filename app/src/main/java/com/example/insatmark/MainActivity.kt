package com.example.insatmark

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.insatmark.authentication.LogInScreen
import com.example.insatmark.authentication.MainScreen
import com.example.insatmark.authentication.SignUpScreen
import com.example.insatmark.ui.theme.InsatMarkTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InsatMarkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AuthenticationApp()
                }
            }
        }
    }
}


enum class AuthScreen {
    Main,
    SignUp,
    Login,
    Success
}
sealed class  DestinationScreen(val route: String){
    object Main: DestinationScreen("main")
    object SignUp: DestinationScreen("SignUp")
    object Login: DestinationScreen("Login")
    object Success: DestinationScreen("Success")
}
@Composable
fun AuthenticationApp(){
    val vm = hiltViewModel<FireBaseViewModel>()
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = DestinationScreen.Main.route,
    ){
        composable( route = DestinationScreen.Main.route){
            MainScreen(navController  , vm )
        }
        composable( route = DestinationScreen.SignUp.route){
           SignUpScreen(navController, vm)
        }
        composable( route = DestinationScreen.Login.route){
            LogInScreen(navController, vm )
        }
    }
}
