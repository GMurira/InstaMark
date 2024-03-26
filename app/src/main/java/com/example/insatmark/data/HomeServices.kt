package com.example.insatmark.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.insatmark.R

data class HomeServices(
   @StringRes val name: Int,
    @DrawableRes val serviceIcon: Int

)

val homeServices = listOf(
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
)