package com.example.wellbeing.custom

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val icon: ImageVector,
    val id:String,
    val title: String,

){
    object Step:Screen(Icons.Outlined.DirectionsWalk,"step","Screen" )
    object Water:Screen( Icons.Outlined.WaterDrop,"water","Water")
    object Daily:Screen(Icons.Outlined.LockClock,"daily","Daily" )
    object Settings:Screen( Icons.Outlined.Settings,"settings","Settings")

    object Items{
        val list = listOf(
            Step,Water,Daily, Settings
        )
    }
}
