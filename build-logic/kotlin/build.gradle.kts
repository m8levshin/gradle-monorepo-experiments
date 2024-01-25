plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("com.mlevshin.gradle-monorepo.platforms:gradle-plugins-platform"))


    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin")
    implementation("io.ktor.plugin:plugin")
    implementation("org.jetbrains.kotlin.plugin.serialization:org.jetbrains.kotlin.plugin.serialization.gradle.plugin")
}
