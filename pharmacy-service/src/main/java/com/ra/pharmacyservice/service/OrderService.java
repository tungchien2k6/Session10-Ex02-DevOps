package com.ra.pharmacyservice.service;

import com.ra.pharmacyservice.event.OrderEvent;

public interface OrderService {
    String processOrder(OrderEvent orderEvent);
}