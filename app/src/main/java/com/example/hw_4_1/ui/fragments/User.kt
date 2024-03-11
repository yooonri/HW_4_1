package com.example.hw_4_1.ui.fragments
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val name : String ="",
    val email : String= "",
    val password : String =""

) : Parcelable
