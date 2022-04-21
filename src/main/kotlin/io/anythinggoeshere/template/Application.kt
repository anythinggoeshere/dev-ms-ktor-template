package io.anythinggoeshere.template

import io.ktor.application.Application
import io.anythinggoeshere.template.configuration.koinConfiguration
import io.anythinggoeshere.template.configuration.ktorConfiguration
import io.anythinggoeshere.template.infrastructure.monitoring.configureMonitoring
import io.anythinggoeshere.template.presentation.configureRouting

fun main(args: Array<String>): Unit =
    io.ktor.server.cio.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    ktorConfiguration()
    koinConfiguration()
    configureMonitoring()
    configureRouting()
}
