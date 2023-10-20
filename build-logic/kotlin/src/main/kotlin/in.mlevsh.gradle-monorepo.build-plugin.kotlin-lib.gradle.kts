import gradle.kotlin.dsl.accessors._79d43cbc702fed4cca83c21f5b1f47aa.implementation

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

dependencies {
    implementation(platform("in.mlevs.gradle-monorepo.platforms:kotlin-app-platform"))

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json")
}