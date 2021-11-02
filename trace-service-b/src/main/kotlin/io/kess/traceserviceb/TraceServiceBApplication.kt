package io.kess.traceserviceb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TraceServiceBApplication

fun main(args: Array<String>) {
	runApplication<TraceServiceBApplication>(*args)
}
