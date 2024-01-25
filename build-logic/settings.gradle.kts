rootProject.name = "build-logic"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}

includeBuild("../platforms")

include("kotlin")