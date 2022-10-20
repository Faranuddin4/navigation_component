package com.example.seesionnavigationcomponent.homescreen.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(
    val name: String,
    var age: Int,
) : Parcelable