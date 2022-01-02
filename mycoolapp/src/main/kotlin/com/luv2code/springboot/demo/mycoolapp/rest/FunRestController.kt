package com.luv2code.springboot.demo.mycoolapp.rest

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class FunRestController {
    @Value("\${coach.name}")
    private val coachName: String ?= null

    @Value("\${team.name}")
    private val teamName: String ?= null

    @GetMapping("/teaminfo")
    public fun getTeamInfo(): String {
        return "Coach: ${coachName}, Team: ${teamName}"
    }

    @GetMapping("/")
    public fun sayHello(): String {
        return "Hello World! Time on server is ${LocalDateTime.now()}"
    }
}