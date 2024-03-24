package com.hardi.bottomnavigation.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun AccountScreen() {
    TopAppBar(
        navigationIcon = {
//            IconButton(onClick = //* do someything */) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back"
                )
//            }
        },
        title = {
            Text(
                text = "Account",
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Clip,
                modifier = Modifier.padding(10.dp)
            )
        },
        actions = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Back",
                modifier = Modifier.padding(15.dp)
            )
        }
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Welcome to, Acount Screen",
            fontFamily = FontFamily.Cursive,
            color = Color.Cyan,
            fontSize = 30.sp
        )
    }
}