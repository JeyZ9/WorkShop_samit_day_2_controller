package com.daytwo.daytwo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DaytwoApplication

//@RestController
//@RequestMapping("/")
//class HomeController{
//    @GetMapping("/hello")
//    fun hello(): String{
//        return "Hello Spring Boot Application!"
//    }
//}

fun main(args: Array<String>) {
    runApplication<DaytwoApplication>(*args)
}
