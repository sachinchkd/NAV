package com.example.wellbeing.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.WaterDrop
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.wellbeing.ViewModel.ReminderViewModel
import com.example.wellbeing.color
import kotlinx.coroutines.InternalCoroutinesApi

@OptIn(InternalCoroutinesApi::class)
@Composable
fun WaterScreen(){

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            //.background(color = "#161B21".color)
//        ,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Icon(
//            imageVector = Icons.Default.WaterDrop,
//            contentDescription = "profile",
//            tint = "#F4A950".color
//        )
//        // Text to Display the current Screen
//        Text(text = "Drinking Water", color = "#F96167".color)
//    }
    val reminderViewModel: ReminderViewModel = viewModel()
    val waterIntakeValue = reminderViewModel.waterIntakeQuantity.collectAsState()

    Text(text = "Hello $waterIntakeValue!")
}