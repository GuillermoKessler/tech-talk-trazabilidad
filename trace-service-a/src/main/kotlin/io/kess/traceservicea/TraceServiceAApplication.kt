package io.kess.traceservicea

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TraceServiceAApplication

fun main(args: Array<String>) {
	runApplication<TraceServiceAApplication>(*args)
}
