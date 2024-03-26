package com.example.insatmark

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FireBaseViewModel @Inject constructor(
    val auth: FirebaseAuth
) :ViewModel(){
    val signedIn = mutableStateOf(false)
    val inProgress = mutableStateOf( false)
    val popupNotification = mutableStateOf(false)

    fun onSignIn(email: String, pass: String){
        inProgress.value = true


        auth.createUserWithEmailAndPassword(email, pass)
            .addOnCompleteListener(){
                if (it.isSuccessful){
                    signedIn.value = true
                }else{

                }
            }
    }

    fun Login(email: String, pass: String){
        inProgress.value = true

        auth.signInWithEmailAndPassword(email, pass)
            .addOnCompleteListener{
                if (it.isSuccessful){
                    signedIn.value = true
                } else{

                }
                inProgress.value = false
            }
    }
}