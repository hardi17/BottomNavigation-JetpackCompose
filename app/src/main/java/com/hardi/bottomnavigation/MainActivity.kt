package com.hardi.bottomnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hardi.bottomnavigation.ui.theme.BottomNavigationTheme
import com.hardi.bottomnavigation.ui.utils.AppNavigationBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationTheme {
                  AppNavigationBar()
            }
        }
    }
}
