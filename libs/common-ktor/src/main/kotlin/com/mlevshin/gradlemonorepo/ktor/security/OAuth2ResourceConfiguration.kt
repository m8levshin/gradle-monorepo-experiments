package com.mlevshin.gradlemonorepo.ktor.security

import com.auth0.jwk.JwkProviderBuilder
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import java.util.concurrent.TimeUnit

class OAuth2ResourceConfiguration {
    companion object {
        const val OAUTH2_SECURITY_CONFIGURATION = "oauth2-resource"
    }
}

/**
 * This is a fake example meant to demonstrate how dependency resolution works in the context of a Ktor server
 * using JWT for authentication.
 */
fun Application.configureResourceServerSecurity() {

    val jwkProviderProperties = JwkProviderProperties()
    jwkProviderProperties?.let {
        val jwkProvider = JwkProviderBuilder(Url(jwkProviderProperties.jwkSetUrl!!).toURI().toURL())
            .cached(10, 24, TimeUnit.HOURS)
            .rateLimited(10, 1, TimeUnit.MINUTES)
            .build()

        install(Authentication) {
            jwt(OAuth2ResourceConfiguration.OAUTH2_SECURITY_CONFIGURATION) {
                verifier(jwkProvider, jwkProviderProperties.issuer!!) {
                    withAnyOfAudience(*jwkProviderProperties.audiences!!.toTypedArray())
                }
                validate { credential ->
                    JWTPrincipal(credential.payload)
                }
                challenge { defaultScheme, realm ->
                    //throw exception
                }
            }
        }
    }
}