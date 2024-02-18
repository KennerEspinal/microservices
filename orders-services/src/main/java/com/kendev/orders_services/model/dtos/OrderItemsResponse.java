package com.kendev.orders_services.model.dtos;

public record OrderItemsResponse(Long id, String sku, Double price, Long quantity) {
}
