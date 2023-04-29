package com.bits.wilp.demo_service_2.order;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {

    @Id
    public Integer id;

    public String itemName;
    public Integer customerId;
    public Integer price;

    public Order(Integer id, String itemName, Integer customerId, Integer price) {
        this.id = id;
        this.itemName = itemName;
        this.customerId = customerId;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", itemName='" + itemName + '\'' + ", customerId='" + customerId + '\'' + ", price=" + price + '}';
    }
}