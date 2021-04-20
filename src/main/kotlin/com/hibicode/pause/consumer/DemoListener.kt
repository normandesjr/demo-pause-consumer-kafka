package com.hibicode.pause.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.annotation.KafkaListeners
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class DemoListener {

    @KafkaListener(id = "demo.listener", topics = ["meu-topico"], groupId = "meu-grupo")
    fun listener(@Payload message: String) {
        println(">>>> message: $message")
        Thread.sleep(1000)
    }

}