package com.him.shopnova.ui.screens.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboardscreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Dashboard") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            },

            actions ={
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Settings"
                    )
                }

                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.AddLocation,
                        contentDescription = "Location"
                    )
                }

            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Red,
                navigationIconContentColor = Color.LightGray,
                actionIconContentColor = Color.LightGray,
                titleContentColor = Color.LightGray,
            )
        )
        // End of TopAppbar


    }




}
@Preview(showBackground = true)
@Composable

fun  Dashboardscreenpreview(){
    Dashboardscreen(rememberNavController())
}