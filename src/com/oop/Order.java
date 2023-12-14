package com.oop;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Order {

    private String orderId;

    private Date orderDate;

    public BigDecimal amount;

    private String status;

    public Order(String orderId, Date orderDate, BigDecimal amount,String status) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.amount = amount;
        this.status = status;
    }

    abstract void validate(String orderId);

    abstract void processOrder(String orderId);

    void cancelOrder(String orderId){
        System.out.println("Cancelling order with ID " + orderId);
    }

}
