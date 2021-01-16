package com.gorlah.microservice

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
class PropertyController(@Value("\${property}") private val property: String) {

    @GetMapping("/property")
    fun hello() = property
}
