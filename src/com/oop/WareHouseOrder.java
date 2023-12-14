package com.oop;


import java.math.BigDecimal;
import java.util.Date;

public class WareHouseOrder extends Order{

    private String orderId;

    private Date orderDate;

    private BigDecimal amount;

    private String status;

    private String wareHouseId;

    public WareHouseOrder(String orderId, Date orderDate, BigDecimal amount, String status,String wareHouseId) {
        super(orderId, orderDate, amount,status);

        this.wareHouseId = wareHouseId;
    }

    @Override
    public void validate(String orderId) {

        System.out.println("Validating ware house order with ID "+ orderId);

    }

    @Override
    public void processOrder(String orderId) {

        System.out.println("Processing ware house Order with ID " + orderId);
    }
}
