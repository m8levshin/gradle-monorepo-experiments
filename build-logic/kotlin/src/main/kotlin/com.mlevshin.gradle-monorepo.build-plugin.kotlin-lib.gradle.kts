plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

dependencies {
    implementation(platform("com.mlevshin.gradle-monorepo.platforms:kotlin-app-platform"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json")
}