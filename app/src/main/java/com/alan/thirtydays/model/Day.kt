package com.alan.thirtydays.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Day(
    val day: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val imageId: Int
) {
}