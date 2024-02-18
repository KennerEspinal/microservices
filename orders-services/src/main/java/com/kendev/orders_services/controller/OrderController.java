package com.kendev.orders_services.controller;

import com.kendev.orders_services.model.dtos.OrderRequest;
import com.kendev.orders_services.model.dtos.OrderResponse;
import com.kendev.orders_services.services.OrderServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderServices orderServices;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrder(@RequestBody OrderRequest orderRequest) {
        this.orderServices.createdOrder(orderRequest);
        return "Order created successfully";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<OrderResponse> getAllOrders() {
        return this.orderServices.getAllOrders();
    }
}
