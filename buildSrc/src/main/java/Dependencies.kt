object Dependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
    const val material = "com.google.android.material:material:${Versions.material}"

    // Hilt
    const val hiltCore = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltDaggerAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltCommon = "androidx.hilt:hilt-common:${Versions.hiltSnapShot}"
    const val hiltViewModelLifecycle = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltSnapShot}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltSnapShot}"

    // Navigation component
    const val navComponentFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navComponent}"
    const val navComponentUi = "androidx.navigation:navigation-ui-ktx:${Versions.navComponent}"

    // OkHttp
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"

    // Gson
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:2.8.1"


    // Lifecycle
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleCommon = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    const val lifecycleExtension = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"

    //Lottie
    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"

    //MDC
    const val MDC = "com.google.android.material:material:${Versions.mdc}"
}

object Modules{
    const val utilities = ":utilities"
}