package com.him.shopnova.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.him.shopnova.R
import com.him.shopnova.navigation.ROUT_DASHBOARD
import com.him.shopnova.navigation.ROUT_ONBOARDING1

@Composable
fun OnboardingScreen2(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment= Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    )
    {
        Image(
            painter = painterResource(R.drawable.delivery),
            contentDescription = "delivery",
            modifier = Modifier.size(200.dp),
        )


        Spacer(
            modifier = Modifier.height(20.dp)

        )

        Text(
            text = "Fast Delivery",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
        )

        Spacer(
            modifier = Modifier.height(10.dp)

        )

        Text(
            text = "Expedited shipping delivers much faster and often comes with real-time tracking and flexible delivery windows. Our shipping is budget-friendly!!!",
            fontWeight = FontWeight.Light,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.None,

            )

        Spacer(
            modifier = Modifier.height(10.dp)

        )

        Button(
            onClick = {navController.navigate(ROUT_DASHBOARD)},
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp)
        ) {
            Text(
                text = "Next >>",
            )
        }

        Button(
            onClick = { navController.navigate(ROUT_ONBOARDING1)},
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp)
        ) {
            Text(
                text = "<< Previous",
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun OnboardingScreen2Preview(){
    OnboardingScreen2(rememberNavController())

}