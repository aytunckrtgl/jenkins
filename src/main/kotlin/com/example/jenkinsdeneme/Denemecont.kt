package com.example.jenkinsdeneme

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class Denemecont(
) {

    @GetMapping
    fun hello(): String {
        return "selam dost"
    }
}
