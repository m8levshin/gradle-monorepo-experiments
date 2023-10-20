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

rootProject.name = "build-logic"

include("kotlin")