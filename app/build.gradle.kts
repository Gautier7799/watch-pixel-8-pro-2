plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.gautier7799.watchfaces"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.gautier7799.watchfaces"
        // هذا هو التغيير الحاسم الذي سيجعل الساعة تقبل الواجهة!
        minSdk = 35
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}
