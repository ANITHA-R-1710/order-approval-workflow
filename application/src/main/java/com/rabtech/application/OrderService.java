package com.rabtech.application;

import com.rabtech.domain.Order;
import java.math.BigDecimal;
import java.util.*;

public class OrderService {
    private final Map<String, Order> orders = new HashMap<>();

    public Order createOrder(String customerName, BigDecimal amount) {
        Order order = new Order(customerName, amount);
        orders.put(order.getId(), order);
        return order;
    }

    public void approveOrder(String id, String approver) {
        Order order = orders.get(id);
        if (order == null) throw new IllegalArgumentException("Order not found: " + id);
        order.approve(approver);
    }

    public void rejectOrder(String id, String approver) {
        Order order = orders.get(id);
        if (order == null) throw new IllegalArgumentException("Order not found: " + id);
        order.reject(approver);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }
}