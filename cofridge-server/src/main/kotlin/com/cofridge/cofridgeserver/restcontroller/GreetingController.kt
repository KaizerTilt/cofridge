package com.cofridge.cofridgeserver.restcontroller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter = AtomicLong()

    @GetMapping("/api/greeting")
    fun greeting(@RequestParam(value = "name") name : String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")
}

data class Greeting(val id: Long, val content: String)