package com.him.shopnova.ui.screens.splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import android.window.SplashScreenView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.him.shopnova.R
import com.him.shopnova.navigation.ROUT_ONBOARDING1
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController) {

    // Navigation

    val coroutine = rememberCoroutineScope ()

    coroutine.launch {

        delay(5000)
        navController.navigate(ROUT_ONBOARDING1)

    }
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Red),
        horizontalAlignment= Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(R.drawable.splash),
            contentDescription = "splash",
            modifier = Modifier.size(200.dp),
        )

    }




}
@Preview(showBackground = true)
@Composable

fun  SplashScreenpreview(){
    SplashScreen(rememberNavController())
}
