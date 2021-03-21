package edu.itesm.appchallenge

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Lakes(val picture:Int, val name:String, val description: String,  val family: String): Parcelable
