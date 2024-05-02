package com.example.fastfood

import androidx.annotation.DrawableRes

object Utils{

    val category = listOf(
        Category(title = "test1", resId = R.drawable.test, id = 0),
        Category(title = "test2", resId = R.drawable.baseline_10k_24, id = 1),
        Category(title = "test3", resId = R.drawable.baseline_4g_plus_mobiledata_24, id = 2),
        Category(title = "None", resId = R.drawable.ic_launcher_foreground, id = 100)
    )

}

data class Category (
    @DrawableRes val resId:Int = -1,
    val title:String = "",
    val id:Int = -1
)