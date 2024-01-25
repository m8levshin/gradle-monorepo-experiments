plugins {
    id("com.mlevshin.gradle-monorepo.build-plugin.kotlin-lib")
    id("com.mlevshin.gradle-monorepo.build-plugin.ktor-app")
}

dependencies {
    implementation(project(":domain-core"))
    implementation("com.mlevshin.gradle-monorepo.libs:common-ktor")
    implementation("io.ktor:ktor-server-netty")
}