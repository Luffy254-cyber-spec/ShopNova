package com.him.shopnova.ui.screens.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

// first fuction is for UI
@Composable
fun OnboardingScreen1(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment= Alignment.CenterHorizontally,
        verticalArrangement = Alignment.CenterVertically as Arrangement.Vertical
    )
            {
        // pass contents of column
        Text(
            text = "ShopNova",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            color = Color.Red,
            fontFamily = FontFamily.Cursive,

        )

    }

}

// second function is for preview
@Preview(showBackground = true)
@Composable
fun OnboardingScreen1Preview(){
    OnboardingScreen1(rememberNavController())

}