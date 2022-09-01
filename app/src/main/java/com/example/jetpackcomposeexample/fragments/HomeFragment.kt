package com.example.jetpackcomposeexample.fragments

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeexample.fragments.screens.HomeScreen
import com.example.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme
import java.lang.reflect.Modifier

    @Composable
    fun HomeFragment() {
        JetpackComposeExampleTheme() {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                HomeScreen(name = "Android")
            }
        }
    }

    @Preview(showBackground = true)
    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    fun HomeFragmentPreview() {
        JetpackComposeExampleTheme() {
            HomeFragment()
        }
    }