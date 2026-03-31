// File: build.gradle.kts (ROOT PROJECT)

plugins {
    // Android Gradle Plugin
    alias(libs.plugins.android.application) apply false

    // Kotlin
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.serialization) apply false

    // Dependency Injection
    alias(libs.plugins.hilt.android) apply false

    // Kotlin Symbol Processing
    alias(libs.plugins.ksp) apply false
}