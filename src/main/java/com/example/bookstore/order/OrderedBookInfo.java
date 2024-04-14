package com.example.bookstore.order;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderedBookInfo {
    private Integer orderId;
    private String title;
    private LocalDate date;

    public OrderedBookInfo(Integer orderId, String title, LocalDate date) {
        this.orderId = orderId;
        this.title = title;
        this.date = date;
    }



}
