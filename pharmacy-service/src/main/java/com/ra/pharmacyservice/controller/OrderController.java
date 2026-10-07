package com.ra.pharmacyservice.controller;

import com.ra.pharmacyservice.event.OrderEvent;
import com.ra.pharmacyservice.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/checkout")
    public ResponseEntity<String> checkout(@RequestBody OrderEvent orderEvent) {
        String result = orderService.processOrder(orderEvent);
        return ResponseEntity.ok(result);
    }
}