plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.terraria.arenabuilder"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.terraria.arenabuilder"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
