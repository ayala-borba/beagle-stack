package br.com.zup.beagle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StackDemoApplication

fun main(args: Array<String>) {
	runApplication<StackDemoApplication>(*args)
}
