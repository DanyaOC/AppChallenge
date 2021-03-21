package edu.itesm.appchallenge

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Fields(val picture:Int, val name:String, val description: String,  val family: String): Parcelable
