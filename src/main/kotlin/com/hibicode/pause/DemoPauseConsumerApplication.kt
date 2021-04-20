package com.hibicode.pause

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoPauseConsumerApplication

fun main(args: Array<String>) {
	runApplication<DemoPauseConsumerApplication>(*args)
}
