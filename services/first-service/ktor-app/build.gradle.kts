plugins {
    id("in.mlevsh.gradle-monorepo.build-plugin.kotlin-lib")
    id("in.mlevsh.gradle-monorepo.build-plugin.ktor-app")
}

dependencies {

    implementation(project(":domain-core"))

    implementation("in.mlevs.gradle-monorepo.libs:common-ktor")

    implementation("io.ktor:ktor-server-netty")
}