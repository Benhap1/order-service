package com.kafka.event;

public class OrderEvent {
    private String product;
    private Integer quantity;

    // Constructors
    public OrderEvent() {}

    public OrderEvent(String product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}