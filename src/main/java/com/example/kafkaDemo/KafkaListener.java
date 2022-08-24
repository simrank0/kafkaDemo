package com.example.kafkaDemo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListner {

    @KafkaListener(topics = "testTopic", groupId = "foo")
    void listener(String data) {
        System.out.println("data = " + data);
    }
}
