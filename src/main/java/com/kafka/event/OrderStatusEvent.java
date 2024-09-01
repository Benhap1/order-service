package com.kafka.event;

import java.time.Instant;

public class OrderStatusEvent {
    private String status;
    private Instant date;

    // Constructors
    public OrderStatusEvent() {}

    public OrderStatusEvent(String status, Instant date) {
        this.status = status;
        this.date = date;
    }

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }
}