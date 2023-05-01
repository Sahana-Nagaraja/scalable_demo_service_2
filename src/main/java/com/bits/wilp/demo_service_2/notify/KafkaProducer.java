package com.bits.wilp.demo_service_2.notify;

import com.bits.wilp.demo_service_2.order.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public void notifyCustomer(Order order) {

        String message = "Notification request for order creation for Order ID:" + order.getId();
        kafkaTemplate.send("notifyOrderCreation", order);
        log.info("Sent: {}", message);
    }
}