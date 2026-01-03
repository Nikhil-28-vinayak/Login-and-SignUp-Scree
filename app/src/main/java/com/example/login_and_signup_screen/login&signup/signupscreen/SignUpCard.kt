package com.example.login_and_signup_screen.login


import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.login_and_signup_screen.ui.theme.Brown
import com.example.login_and_signup_screen.ui.theme.Cream

@Composable
fun MySignUpCard(navController: NavHostController) {
    var emailId by remember { mutableStateOf("") }
    var createPassword by remember { mutableStateOf("") }
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Cream),
        shape = RoundedCornerShape(50.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "Login", modifier = Modifier.clickable(onClick = {navController.navigate(Routes.Login)})
                        .padding(start = 16.dp),
                    color = Brown,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    "Sign Up", modifier = Modifier
                        .padding(end = 16.dp),
                    color = Brown,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row(modifier = Modifier.fillMaxWidth().padding(end = 30.dp),
                horizontalArrangement = Arrangement.End) {
                HorizontalDivider(
                    thickness = 2.dp,
                    color = Brown,
                    modifier = Modifier.width(100.dp)
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                "Enter email id", modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                color = Brown,
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = emailId,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .border(
                        width = 2.dp,
                        color = Brown,
                        shape = RoundedCornerShape(50.dp)
                    ),
                onValueChange = { emailId = it },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White,
                    unfocusedBorderColor = Brown,
                    focusedBorderColor = Brown
                ),
                shape = RoundedCornerShape(50.dp),
                singleLine = true,
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                "Create password", modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                color = Brown,
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = createPassword,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .border(
                        width = 2.dp,
                        color = Brown,
                        shape = RoundedCornerShape(50.dp)
                    ),
                onValueChange = { createPassword = it },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White,
                    unfocusedBorderColor = Brown,
                    focusedBorderColor = Brown
                ),
                shape = RoundedCornerShape(50.dp),
                singleLine = true,
            )
            Spacer(modifier = Modifier.height(65.dp))
            Button(
                onClick = {}, colors = ButtonDefaults.buttonColors(
                    containerColor = Brown,
                ), shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .padding(horizontal = 40.dp)
            ) {
                Text("Sign Up", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            }
            TextButton(onClick = {}) {
                Text(
                    "Or Login here",
                    color = Brown,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Spacer(modifier = Modifier.height(60.dp))
            Text("Terms & Condition Apply", color = Brown, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

