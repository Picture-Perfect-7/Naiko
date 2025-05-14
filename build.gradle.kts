// Root build.gradle.kts

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0")
    }
}

plugins {
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.22" apply false
    id("com.mikepenz.aboutlibraries.plugin") version "10.8.3" apply false
    id("dev.icerock.mobile.multiplatform-resources") version "0.23.0" apply false
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
