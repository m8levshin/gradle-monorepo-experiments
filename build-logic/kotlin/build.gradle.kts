plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("in.mlevs.gradle-monorepo.platforms:gradle-plugins-platform"))


    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin")
    implementation("io.ktor.plugin:plugin")
}
