package com.example.jetpackcomposeexample.fragments.screens

import android.content.res.Configuration
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme

@Composable
fun HomeScreen(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomeScreenPreview() {
    JetpackComposeExampleTheme() {
        HomeScreen("Android")
    }
}