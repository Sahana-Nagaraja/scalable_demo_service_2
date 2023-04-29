package com.bits.wilp.demo_service_2.order;

import com.bits.wilp.demo_service_2.notify.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    KafkaProducer kafkaProducer;

    @PostMapping("/order")
    public Order insertOrder(@RequestBody Order order) {
        System.out.println("Creating order...");
        kafkaProducer.notifyCustomer();
        return orderRepository.save(order);
    }

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable Integer id) {
        return orderRepository.findById(id).orElseThrow();
    }

}
