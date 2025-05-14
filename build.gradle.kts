// Top‐level build.gradle.kts

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        // Android Gradle Plugin from version catalog
        classpath(libs.android.gradlePlugin)
        // Shortcut Gradle plugin
        classpath(libs.android.shortcut.gradle)
    }
}

plugins {
    // Register Kotlin Serialization, AboutLibraries, MOKO, SQLDelight, etc.
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.aboutLibraries)       apply false
    alias(libs.plugins.moko)                 apply false
    alias(libs.plugins.sqldelight)           apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
