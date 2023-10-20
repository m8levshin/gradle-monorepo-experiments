plugins {
    id("io.ktor.plugin") //only for ensuring of dependencies consistency
}

dependencies {
    implementation(platform("in.mlevs.gradle-monorepo.platforms:kotlin-app-platform"))
}