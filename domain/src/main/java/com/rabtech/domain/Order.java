package com.rabtech.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Order {
    private String id;
    private String customerName;
    private BigDecimal amount;
    private OrderStatus status;
    private String approver;
    private LocalDateTime createdAt;

    // 2-arg - OrderService ku
    public Order(String customerName, BigDecimal amount) {
        this.id = "ORD-" + UUID.randomUUID().toString().substring(0, 8);
        this.customerName = customerName;
        this.amount = amount;
        this.status = OrderStatus.PENDING;
        this.createdAt = LocalDateTime.now();
    }

    // 3-arg - Main ku
    public Order(String id, String customerName, BigDecimal amount) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
        this.status = OrderStatus.PENDING;
        this.createdAt = LocalDateTime.now();
    }

    public void approve(String approver) {
        if (this.status != OrderStatus.PENDING) {
            throw new IllegalStateException("Only PENDING order can be approved");
        }
        this.status = OrderStatus.APPROVED;
        this.approver = approver;
    }

    public void reject(String approver) {
        if (this.status != OrderStatus.PENDING) {
            throw new IllegalStateException("Only PENDING order can be rejected");
        }
        this.status = OrderStatus.REJECTED;
        this.approver = approver;
    }

    public String getId() { return id; }
    public String getCustomerName() { return customerName; }
    public BigDecimal getAmount() { return amount; }
    public OrderStatus getStatus() { return status; }
    public String getApprovedBy() { return approver; }
    public String getApprover() { return approver; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}