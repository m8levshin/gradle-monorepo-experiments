plugins {
    id("com.mlevshin.gradle-monorepo.build-plugin.kotlin-lib")
    id("com.mlevshin.gradle-monorepo.build-plugin.ktor-app")
}


dependencies {

    api(project(":kotlin-serdes"))

    implementation("com.auth0:java-jwt")

    api("io.ktor:ktor-server-auth")
    api("io.ktor:ktor-server-auth-jwt")
}