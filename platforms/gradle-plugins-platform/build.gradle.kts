plugins {
    id("java-platform")
}

javaPlatform.allowDependencies()

dependencies {


    constraints {
        api("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.9.10")
        api("org.jetbrains.kotlin.plugin.serialization:org.jetbrains.kotlin.plugin.serialization.gradle.plugin:1.9.10")
        api("io.ktor.plugin:plugin:2.3.5")
    }
}
