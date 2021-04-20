package com.hibicode.pause.controller

import org.springframework.kafka.config.KafkaListenerEndpointRegistry
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/listener")
class KafkaListenerController(val registry: KafkaListenerEndpointRegistry) {

    @PutMapping("/resume")
    fun resume() {
        registry.getListenerContainer("demo.listener").resume()
    }

    @PutMapping("/pause")
    fun pause() {
        registry.getListenerContainer("demo.listener").pause()
    }

}