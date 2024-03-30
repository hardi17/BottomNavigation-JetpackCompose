@file:OptIn(ExperimentalMaterial3Api::class)

package com.hardi.bottomnavigation.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hardi.bottomnavigation.ui.utils.ScreensName

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onIconClick: () -> Unit) {
    TopAppBar(
        title = { Text("Home") },
        actions = {
            IconButton(onClick = { onIconClick()}) {
                Icon(Icons.Default.AccountCircle, contentDescription = "Account")
            }
        }
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "Welcome to, Home Screen",
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp,
            color = Color.Black
        )
    }
}
