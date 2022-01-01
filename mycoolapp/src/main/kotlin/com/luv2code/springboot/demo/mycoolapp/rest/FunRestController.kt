package com.luv2code.springboot.demo.mycoolapp.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class FunRestController {
    @GetMapping("/")
    public fun sayHello(): String {
        return "Hello World! Time on server is ${LocalDateTime.now()}"
    }
}