package com.him.shopnova.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.him.shopnova.ui.screens.auth.Registerscreen
import com.him.shopnova.ui.screens.auth.Registerscreen
import com.him.shopnova.ui.screens.auth.loginscreen
import com.him.shopnova.ui.screens.auth.loginscreen
import com.him.shopnova.ui.screens.onboarding.OnboardingScreen1
import com.him.shopnova.ui.screens.onboarding.OnboardingScreen2
import com.him.shopnova.ui.screens.onboarding.OnboardingScreen3


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ONBOARDING1
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_LOGIN) {
            loginscreen(navController)
        }
        composable(ROUT_REGISTER) {
            Registerscreen(navController)
        }
        composable(ROUT_ONBOARDING1) {
            OnboardingScreen1(navController)
        }
        composable(ROUT_ONBOARDING2) {
            OnboardingScreen2(navController)
        }
        composable(ROUT_ONBOARDING3) {
            OnboardingScreen3(navController)
        }


    }
}

@Composable
fun HomeScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}