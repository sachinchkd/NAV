package com.example.wellbeing.screens

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.DirectionsWalk
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
//import com.example.wellbeing.Services.TrackingService
import com.example.wellbeing.ViewModel.MainViewModel
import com.example.wellbeing.color
import com.example.wellbeing.ui.theme.Poppins
import com.example.wellbeing.ui.theme.PrimaryColor

//import com.example.wellbeing.others.Constants

@Composable
fun StepScreen(){
    CardDemo()
    BmiUI()
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            //.background(color = "#161B21".color)
//        ,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Icon(
//            imageVector = Icons.Outlined.DirectionsWalk,
//            contentDescription = "step",
//            tint = "#F4A950".color
//        )
//        // Text to Display the current Screen
//        Text(text = "Step Count", color = "#F96167".color)
//    }
}

//fun sendCommandToService(action: String,mContext: Context) {
//    mContext.startService(Intent(mContext, TrackingService::class.java).also {
//        it.action = Constants.ACTION_START_OR_RESUME_SERVICE
//    })
//
//}

@Composable
fun CardDemo() {
    val mContext = LocalContext.current
    val viewModel = viewModel<MainViewModel>()
    val steps = viewModel.stepCount.value

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .size(300.dp)
    ) {
        Column(verticalArrangement = Arrangement.SpaceEvenly) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Text(
                        text = "$steps",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 100.sp
                    )
                    Button(onClick = { /* Do something! */ }) {
                        Text("Paused")
                    }
                }
                Spacer(Modifier.width(180.0.dp))
                OutlinedButton(
                    onClick = {
//                        sendCommandToService(
//                            Constants.ACTION_START_OR_RESUME_SERVICE,
//                            mContext)
                    }, shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.padding(0.dp)
                ) {
                    Icon(
                        Icons.Default.PlayArrow,
                        contentDescription = "Play",
                        tint = PrimaryColor
                    )
                }
            }

            Spacer(
                Modifier
                    .size(30.dp)
                    .fillMaxWidth(1f))

            Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.padding(10.dp)) {
                Column(modifier = Modifier
                    .height(100.dp)
                    .width(90.dp)) {
                    Icon(
                        Icons.Default.LocationOn,
                        contentDescription = "Location",
                        tint = PrimaryColor,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text(text = "1.5",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Poppins,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text(text = "Km",
                        fontSize = 10.sp,

                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
                }
                Spacer(Modifier.size(20.dp))
                Column(modifier = Modifier
                    .height(100.dp)
                    .width(90.dp)) {
                    Icon(
                        Icons.Default.ArrowForward,
                        contentDescription = "Location",

                        tint = PrimaryColor,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text(text = "150", fontSize = 20.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold
                        ,modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text(text = "Calories",
                        fontSize = 10.sp,

                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
                }
                Spacer(Modifier.size(20.dp))
                Column(modifier = Modifier
                    .height(100.dp)
                    .width(90.dp)) {
                    Icon(
                        Icons.Default.AccountBox,

                        contentDescription = "Location",
                        tint = PrimaryColor,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text(text = "0h 19m",
                        fontFamily = Poppins,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text(text = "Walking Time",
                        fontSize = 10.sp,

                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
                }
            }
        }
    }
}

@Composable
fun BmiUI(){

}