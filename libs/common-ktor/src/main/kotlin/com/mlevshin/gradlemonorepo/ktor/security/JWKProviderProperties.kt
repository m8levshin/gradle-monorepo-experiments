package com.mlevshin.gradlemonorepo.ktor.security

data class JwkProviderProperties(
    val issuer: String? = null,
    val audiences: List<String>? = null,
    val jwkSetUrl: String? = null,
)