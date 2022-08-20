package com.example.wellbeing.custom

import android.graphics.Color.parseColor
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController



@Composable
fun CustomBottomNavigation(
//    currentScreenId:String,
//    onItemSelected:(Screen)->Unit,
    navController: NavController
){
    val items = Screen.Items.list
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Row(
        modifier = Modifier
//            .background(MaterialTheme.colors.background)
//            .background(color = "#161B21".color)
            .padding(50.dp, 0.dp, 0.dp, 10.dp)

        ,
        verticalAlignment = Alignment.CenterVertically
//        horizontalArrangement = Arrangement.Center,
////        verticalAlignment = Alignment.CenterVertically
    ) {
        items.forEach{
                item ->

//            CustomBottomNavigationItem(item = item,isSelected = item.id == currentScreenId)
//            {
//                onItemSelected(item)
//            }
            CustomBottomNavigationItem(item = item, currentDestination = currentDestination,navController = navController)

            }
    }
}



@Composable
//fun CustomBottomNavigationItem(item:Screen, isSelected:Boolean,onClick: () -> Unit){
fun CustomBottomNavigationItem(item:Screen, currentDestination: NavDestination?,
                               navController: NavController,
                               isSelected: Boolean = currentDestination?.hierarchy?.any {
                                   it.route == item.id
                               }== true,

                               onClick: () -> Unit ={
                                   navController.navigate(item.id)
                               }){
//    val navController = rememberNavController()
    val background = if (isSelected) "#161B21".color.copy(alpha = 0.8f) else Color.Transparent
//    val background = if (isSelected) MaterialTheme.colors.primary.copy(alpha = 0.1f) else Color.Transparent
    val contentColor = if (isSelected) "#F4A950".color else MaterialTheme.colors.onBackground

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(40.dp))
            .background(background)
            .clickable(onClick = onClick)
            .padding(20.dp, 0.dp, 20.dp, 20.dp)
//            .horizontalScroll(rememberScrollState())

        ,




    ) {

        Row(

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,


        ) {

            Icon(
                imageVector = item.icon,
                contentDescription = null,
                tint = contentColor,
                modifier = Modifier
                    .padding(5.dp,5.dp,0.dp,5.dp)

                )



        }
        AnimatedVisibility(visible = isSelected) {

            Text(
                text = item.title,
                color = contentColor,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(0.dp,30.dp,0.dp,0.dp)

            )

        }


    }

}

val String.color
    get() = Color(parseColor(this))