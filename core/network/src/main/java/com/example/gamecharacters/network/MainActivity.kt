package com.example.gamecharacters.network

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.compose.rememberNavController
import com.example.gamecharacters.extensions.collectWithLifecycle
import com.example.gamecharacters.navigation.AppBarState
import com.example.gamecharacters.navigation.NavigationFactory
import com.example.gamecharacters.navigation.NavigationHost
import com.example.gamecharacters.navigation.NavigationManager
import com.example.gamecharacters.ui.ThronesTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationFactories: @JvmSuppressWildcards Set<NavigationFactory>

    @Inject
    lateinit var navigationManager: NavigationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThronesTheme {
                val navController = rememberNavController()
                var appBarState by remember { mutableStateOf(AppBarState()) }

                Scaffold(
                    topBar = { MainTopAppBar(appBarState) { navController.navigateUp() } }
                ) {
                    NavigationHost(
                        modifier = Modifier.padding(it),
                        navController = navController,
                        factories = navigationFactories
                    ) { newAppBarState ->
                        appBarState = newAppBarState
                    }
                }

                navigationManager
                    .navigationEvent
                    .collectWithLifecycle(
                        key = navController
                    ) {
                        navController.navigate(it.destination, it.navOptions)
                    }
            }
        }
    }
}

@Composable
private fun MainTopAppBar(appBarState: AppBarState, navigateUp: () -> Unit) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = appBarState.title,
                fontWeight = FontWeight.Medium
            )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        ),
        navigationIcon = {
            if (appBarState.showNavigationIcon) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        tint = MaterialTheme.colorScheme.onPrimary,
                        contentDescription = "Back navigation"
                    )
                }
            }
        },
        actions = {
            appBarState.actions?.invoke(this)
        }
    )
}
