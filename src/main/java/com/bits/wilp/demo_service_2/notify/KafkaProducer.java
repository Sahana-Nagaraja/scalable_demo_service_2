package com.bits.wilp.demo_service_2.notify;

import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void notifyCustomer() {
        String message = "The customer has placed the order";
        kafkaTemplate.send("notifyCustomer", message);
        log.info("Sent: {}", message);
    }
}