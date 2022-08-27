package com.example.wellbeing.screens

import android.content.Context
import android.content.Intent
import android.provider.SyncStateContract
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.LockClock
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

import com.example.wellbeing.Services.TrackingService
import com.example.wellbeing.ViewModel.MainViewModel
import com.example.wellbeing.color
import com.example.wellbeing.others.Constants


@Composable
fun DailyScreen(){


    Column(
        modifier = Modifier
            .fillMaxSize()
            //.background(color = "#161B21".color),
                ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Outlined.LockClock,
            contentDescription = "daily",
            tint = "#F4A950".color
        )
        // Text to Display the current Screen
        Text(text = "Daily Activity", color = "#F96167".color)
    }
}



