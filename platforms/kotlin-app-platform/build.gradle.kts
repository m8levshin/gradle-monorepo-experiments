plugins {
    id("java-platform")
}

javaPlatform.allowDependencies()

dependencies {

    api(platform("io.arrow-kt:arrow-stack:1.2.0"))

    constraints {

    }
}
