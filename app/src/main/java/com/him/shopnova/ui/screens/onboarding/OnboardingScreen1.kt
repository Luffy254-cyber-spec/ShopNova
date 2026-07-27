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
import com.him.shopnova.navigation.ROUT_ONBOARDING2
import kotlinx.serialization.internal.throwArrayMissingFieldException

// first fuction is for UI
@Composable
fun OnboardingScreen1(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment= Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    )
            {
        // pass contents of column

            Image(
                painter = painterResource(R.drawable.cart),
                contentDescription = "cart",
                modifier = Modifier.size(200.dp),
                )


            Spacer(
                modifier = Modifier.height(20.dp)

            )

        Text(
            text = "ShopNova",
            fontSize =60.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            color = Color.Red,
            fontFamily = FontFamily.Cursive,

        )
                Spacer(
                    modifier = Modifier.height(10.dp)

                )

                Text(
            text = "Shop Smart. Live Better",
            fontWeight = FontWeight.Light,
            fontSize = 30.sp,

            )
            Spacer(
                modifier = Modifier.height(5.dp)

                )

        Text(
            text = "Shop safely and conveniently online with ShopNova, the largest online retailer in Africa. Daily exclusive APP-only “Flash Sales” on top products and brands.",
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.None,


        )
                Spacer(
                    modifier = Modifier.height(5.dp)

                )

                Button(
                    onClick = { navController.navigate(ROUT_ONBOARDING2)},
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.width(250.dp)
                ) {
                    Text(
                        text = "Get Started",
                    )
                }



    }

}

// second function is for preview
@Preview(showBackground = true)
@Composable
fun OnboardingScreen1Preview(){
    OnboardingScreen1(rememberNavController())

}