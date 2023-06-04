package com.unilab

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UniLabApplication

fun main(args: Array<String>) {
	runApplication<UniLabApplication>(*args)
}
