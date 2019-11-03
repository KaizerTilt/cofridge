package com.cofridge.cofridgeserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CofridgeServerApplication

fun main(args: Array<String>) {
    runApplication<CofridgeServerApplication>(*args)
}
