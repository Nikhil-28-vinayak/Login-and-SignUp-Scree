package com.example.login_and_signup_screen.loginscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.login_and_signup_screen.ui.theme.Brown
import com.example.login_and_signup_screen.ui.theme.Cream

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyLoginScreen() {
    val config = LocalConfiguration.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Brown),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom
    ) {
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                "Hey!",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 55.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                "Welcome Back",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 40.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp)
            )
        }
        Spacer(modifier = Modifier.height(25.dp))
        MyCard()
    }
}

