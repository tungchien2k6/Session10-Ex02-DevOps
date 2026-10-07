package com.ra.pharmacyservice.event;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderEvent {
    private String orderId;
    private String medicineId;
    private Integer quantity;
    private LocalDateTime timestamp;
}