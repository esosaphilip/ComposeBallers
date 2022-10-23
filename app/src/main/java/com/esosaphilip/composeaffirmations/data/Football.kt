package com.esosaphilip.composeaffirmations.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Ballers(
   // @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val age : Int,
    val numberOfBallonDor: Int)
