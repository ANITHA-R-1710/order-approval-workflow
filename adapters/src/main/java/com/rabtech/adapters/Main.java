package com.rabtech;

import com.rabtech.domain.Order;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("ORD-1", "Rahul", new BigDecimal("999.00"));

        System.out.println("Before: " + order1.getStatus());

        order1.approve("Admin");

        System.out.println("After: " + order1.getStatus());
        System.out.println("Approved By: " + order1.getApprovedBy());
        System.out.println("Order Approved Successfully!");
    }
}