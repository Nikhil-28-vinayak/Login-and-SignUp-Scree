package com.example.login_and_signup_screen.login

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login_and_signup_scree.signupscreen.MySignUpScreen
import com.example.login_and_signup_screen.loginscreen.MyLoginScreen


@Composable
fun navgraph(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Login){
        composable<Routes.Login> {
            MyLoginScreen(navController)
        }
        composable<Routes.SignUp> {
            MySignUpScreen(navController)
        }
    }
}
