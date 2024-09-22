buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(libs.react.native.gradle.plugin)
    }
}

apply(plugin = "com.facebook.react.rootproject")

repositories {
    google()
    mavenCentral()
}
