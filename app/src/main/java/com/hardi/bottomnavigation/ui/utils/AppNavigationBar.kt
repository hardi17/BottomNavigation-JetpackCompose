package com.hardi.bottomnavigation.ui.utils

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.hardi.bottomnavigation.ui.screen.AccountScreen
import com.hardi.bottomnavigation.ui.screen.CartScreen
import com.hardi.bottomnavigation.ui.screen.HomeScreen
import com.hardi.bottomnavigation.ui.screen.NotificationScreen
import com.hardi.bottomnavigation.ui.screen.SearchScreen

@Preview
@Composable
fun AppNavigationBar() {

    val navHostController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry: NavBackStackEntry? by navHostController.currentBackStackEntryAsState()
                val currentDestination: NavDestination? = navBackStackEntry?.destination

                //list of NavigationItems
                navigationItems.forEach { navigationItems ->
                    NavigationBarItem(selected = currentDestination?.hierarchy?.any { it.route == navigationItems.screen } == true,
                        onClick = {
                            navHostController.navigate(navigationItems.screen) {
                                popUpTo(navHostController.graph.findStartDestination().id) {
//                                    saveState = true
                                    this@navigate.launchSingleTop = true
                                }
                                //    restoreState = true
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = navigationItems.icon, contentDescription = null
                            )
                        },
                        label = {
                            Text(text = navigationItems.title)
                        })
                }
            }
        }) { paddingValues: PaddingValues ->
        NavHost(
            navController = navHostController,
            startDestination = ScreensName.HomeScreen.name,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(route = ScreensName.HomeScreen.name) {
                HomeScreen(
                    onIconClick = {
                        navigateToProfilescreen(navHostController)
                    })
            }

            composable(route = ScreensName.AccountScreen.name) {
                AccountScreen(
                    onBtnClick = {
                        navHostController.popBackStack()
                    })
            }

            composable(route = ScreensName.CartScreen.name) {
                CartScreen()
            }
            composable(route = ScreensName.SearchScreen.name) {
                SearchScreen()
            }
            composable(route = ScreensName.NotificationScreen.name) {
                NotificationScreen()

            }

        }
    }
}

fun navigateToProfilescreen(navHostController: NavHostController) {
    navHostController.navigate(ScreensName.AccountScreen.name) {
        launchSingleTop = true
    }
}
