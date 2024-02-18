package com.kendev.orders_services.model.dtos;

public record BaseResponse(String[] errorMessage) {
    public boolean hasErrors() {
        return errorMessage != null && errorMessage.length > 0;
    }
}
