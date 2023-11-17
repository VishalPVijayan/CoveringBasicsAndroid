plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
    /*kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("kotlin-android")
    id("androidx.navigation.safeargs")
    id("dagger.hilt.android.plugin")*/
}

apply {
    plugin("kotlin-android")
}

android {
    namespace = "com.sevenone1.coveringbasics"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sevenone1.coveringbasics"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.kotlin)
    implementation(Dependencies.appcompat)
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.constraintLayout)


    // Hilt
    implementation(Dependencies.hiltCore)
    implementation(Dependencies.hiltCommon)
    implementation(Dependencies.hiltViewModelLifecycle)
    kapt(Dependencies.hiltDaggerAndroidCompiler)
    kapt(Dependencies.hiltCompiler)

    // Navigation
    implementation(Dependencies.navComponentFragment)
    implementation(Dependencies.navComponentUi)

    // Okhttp
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLogging)

    // Retrofit
    implementation(Dependencies.retrofit)

    // Gson
    implementation(Dependencies.gson)

    //MDC
    implementation(Dependencies.MDC)

    implementation(project(Modules.utilities))

   /* implementation(project(Modules.central))

    //Cat fun facts modules
    implementation(project(Modules.catfunfacts))

    //Dog fun facts modules
    implementation(project(Modules.dogfunfacts))*/

    /*implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")*/
}