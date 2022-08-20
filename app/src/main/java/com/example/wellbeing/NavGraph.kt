package com.example.wellbeing

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.wellbeing.custom.CustomBottomNavigation
import com.example.wellbeing.custom.Screen

import com.example.wellbeing.screens.DailyScreen
import com.example.wellbeing.screens.SettingScreen
import com.example.wellbeing.screens.StepScreen
import com.example.wellbeing.screens.WaterScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(

        navController = navController,
        startDestination = Screen.Daily.id
//        modifier = Modifier.horizontalScroll(rememberScrollState())
    ){
        composable(route = Screen.Step.id){
            StepScreen()
        }
        composable(route = Screen.Water.id){
            WaterScreen()
        }
        composable(route = Screen.Daily.id){
            DailyScreen()
        }
        composable(route = Screen.Settings.id){
            SettingScreen()
        }
    }
}