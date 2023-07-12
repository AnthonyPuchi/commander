package com.example.commander

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommanderApplication

fun main(args: Array<String>) {
	runApplication<CommanderApplication>(*args)
}
