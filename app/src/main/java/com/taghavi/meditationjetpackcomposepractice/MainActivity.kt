package com.taghavi.meditationjetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.taghavi.meditationjetpackcomposepractice.ui.HomeScreen
import com.taghavi.meditationjetpackcomposepractice.ui.theme.MeditationUIYouTubeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIYouTubeTheme {
                HomeScreen()
            }
        }
    }
}