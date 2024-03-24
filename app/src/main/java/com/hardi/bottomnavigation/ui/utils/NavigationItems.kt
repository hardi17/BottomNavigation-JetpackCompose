package com.hardi.bottomnavigation.ui.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItems (
    val title: String,
    val icon: ImageVector,
    val screen: String
)

val navigationItems: List<NavigationItems> = listOf(
    NavigationItems(
        title = "Home",
        icon = Icons.Default.Home,
        screen= ScreensName.HomeScreen.name
    ), NavigationItems(
        title = "Cart",
        icon = Icons.Default.ShoppingCart,
        screen= ScreensName.CartScreen.name
    ),
    NavigationItems(
        title = "Search",
        icon = Icons.Default.Search,
        screen = ScreensName.SearchScreen.name
    ),
    NavigationItems(
        title = "Notification",
        icon = Icons.Default.Notifications,
        screen = ScreensName.NotificationScreen.name
    ),
)