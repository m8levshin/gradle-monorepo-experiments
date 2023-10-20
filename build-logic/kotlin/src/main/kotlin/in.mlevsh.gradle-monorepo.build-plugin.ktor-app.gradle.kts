plugins {
    id("io.ktor.plugin") //only for ensuring of dependencies consistency
    kotlin("plugin.serialization")
}

dependencies {
    implementation(platform("in.mlevs.gradle-monorepo.platforms:kotlin-app-platform"))

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json")
    implementation("io.ktor:ktor-server-core")
    implementation("io.ktor:ktor-server-content-negotiation")
    implementation("io.ktor:ktor-serialization-kotlinx-json")
}