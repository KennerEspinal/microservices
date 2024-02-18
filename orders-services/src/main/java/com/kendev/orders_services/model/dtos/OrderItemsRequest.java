package com.kendev.orders_services.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemsRequest {
    private Long Id;
    private String sku;
    private Double price;
    private Long quantity;
}
