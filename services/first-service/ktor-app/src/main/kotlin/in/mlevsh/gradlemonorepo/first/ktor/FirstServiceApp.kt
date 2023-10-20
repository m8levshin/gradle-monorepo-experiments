package `in`.mlevsh.gradlemonorepo.first.ktor

import `in`.mlevsh.gradlemonorepo.first.domain.TestDomain
import `in`.mlevsh.gradlemonorepo.ktor.config.configureSerialization
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import mapToDto
import java.time.LocalDateTime
import java.util.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module).start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
}

private fun Application.configureRouting() {
    routing {
        route("/api") {
            route("test") {
                get {
                    val testDomain = TestDomain(UUID.randomUUID(), LocalDateTime.now(), LocalDateTime.now())
                    call.respond(HttpStatusCode.OK, testDomain.mapToDto())
                }
            }
        }
    }
}
