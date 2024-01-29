package com.ginogustavo.kafka.consumer;

import com.ginogustavo.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "gino-topic", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info(String.format("Consuming message from gino topic: %s", message));
    }

    @KafkaListener(topics = "gino-topic", groupId = "myGroup")
    public void consumeMessage(Student student) {
        log.info(String.format("Consuming message from gino topic: %s", student.toString()));
    }
}
