# gradle-monorepo-experiments

This project is an attempt to understand the structure of large monorepositories using Gradle. It primarily adopts
techniques and structures from the official Gradle
example: [https://docs.gradle.org/current/samples/sample_structuring_software_projects.html](https://docs.gradle.org/current/samples/sample_structuring_software_projects.html)

The **build-logic** folder contains plugins for different types of modules (e.g., java lib, java app, spring boot,
kotlin lib, kotlin app, kotlin ktor app). Each plugin may include pre-connected plugins and dependencies, allowing the
final module to require only a single plugin plus specific dependencies.

The **platforms** folder contains platform modules (analogous to pom files in Maven), which describe...