// File: app/src/main/java/com/lionico/template/MainActivity.kt
package com.lionico.template

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.lionico.template.ui.theme.LionicoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Install Android 12+ splash screen
        installSplashScreen()

        super.onCreate(savedInstanceState)

        // Draw behind system bars
        enableEdgeToEdge()

        setContent {
            LionicoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        // Header
                        Text(
                            text = "TEMPLATE",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.primary
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        // Description
                        Text(
                            text = "This is a starter template application.",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        Text(
                            text =
                                "Use this project as a foundation for building new Android apps.\n\n" +
                                "It includes:\n" +
                                "• Jetpack Compose\n" +
                                "• Material 3 design\n" +
                                "• Kotlin + KSP\n" +
                                "• Hilt dependency injection\n" +
                                "• Modern Gradle version catalog\n\n" +
                                "Replace this screen with your own UI and features.",
                            fontSize = 15.sp,
                            lineHeight = 22.sp
                        )
                    }
                }
            }
        }
    }
}