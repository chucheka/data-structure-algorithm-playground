package com.oop;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class StoreOrder extends Order{

    private String orderId;

    private Date orderDate;
    private BigDecimal amount;

    private String status;

    private String storeId;

    public StoreOrder(String orderId, Date orderDate, BigDecimal amount, String status,String storeId) {
        super(orderId, orderDate, amount,status);

        this.storeId = storeId;
    }

    @Override
    public void validate(String orderId) {

        System.out.println("Validating store order with ID " + orderId);

    }

    @Override
    public void processOrder(String orderId) {

        System.out.println("Processing Store Order with ID " + orderId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StoreOrder)) return false;
        StoreOrder that = (StoreOrder) o;
        return Objects.equals(orderId, that.orderId) && Objects.equals(orderDate, that.orderDate) && Objects.equals(amount, that.amount) && Objects.equals(status, that.status) && Objects.equals(storeId, that.storeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderDate, amount, status, storeId);
    }
}
