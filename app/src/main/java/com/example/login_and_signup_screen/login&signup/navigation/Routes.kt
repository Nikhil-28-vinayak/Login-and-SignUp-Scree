package com.example.login_and_signup_screen.login

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {

    @Serializable
    object Login : Routes()

    @Serializable
    object SignUp : Routes()

}