package com.example.bookstore.order;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderInfo {
    private int orderId;
    private String email;
    private String name;
    private String surname;
    private String phoneNumber;
    private Integer houseNumber;
    private Integer flatNumber;
    private String street;
    private String postalCode;
    private String city;
    private LocalDate date;
    private int bookId;
    private String title;
    private double price;
    private String imgUrl;
}
