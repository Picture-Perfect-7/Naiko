// Top-level build.gradle.kts

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        // Android Gradle Plugin
        classpath("com.android.tools.build:gradle:8.1.0")
        // Shortcut Gradle plugin
        classpath("com.github.Android-Shortcut:shortcut-gradle-plugin:1.1.0") // Replace with actual version
    }
}

plugins {
    // Kotlin Serialization
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.22" apply false
    // AboutLibraries
    id("com.mikepenz.aboutlibraries.plugin") version "10.8.3" apply false
    // MOKO resources
    id("dev.icerock.mobile.multiplatform-resources") version "0.23.0" apply false
    // SQLDelight
    id("com.squareup.sqldelight") version "1.5.5" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
