package com.gngsn.springmvc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringmvcDemoKtApplication

fun main(args: Array<String>) {
    runApplication<SpringmvcDemoKtApplication>(*args) {
        println("Kotlin Application is RUNNING!")
    }
}
