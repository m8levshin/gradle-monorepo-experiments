rootProject.name = "gradle-monorepo-experiments"


includeBuild("build-logic")
includeBuild("platforms")

includeBuild("libs")
includeBuild("services/first-service")
