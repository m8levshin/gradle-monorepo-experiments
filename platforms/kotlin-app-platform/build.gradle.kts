plugins {
    id("java-platform")
}

javaPlatform.allowDependencies()

dependencies {

    api(platform("io.arrow-kt:arrow-stack:1.2.0"))

    constraints {
        api("com.auth0:java-jwt:4.4.0")
        api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
    }
}
