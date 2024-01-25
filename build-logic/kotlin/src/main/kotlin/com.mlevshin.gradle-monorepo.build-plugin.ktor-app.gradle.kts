plugins {
    id("io.ktor.plugin")
    kotlin("plugin.serialization")
}

dependencies {
    implementation(platform("com.mlevshin.gradle-monorepo.platforms:kotlin-app-platform"))

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json")
    implementation("io.ktor:ktor-server-core")
    implementation("io.ktor:ktor-server-content-negotiation")
    implementation("io.ktor:ktor-serialization-kotlinx-json")
}