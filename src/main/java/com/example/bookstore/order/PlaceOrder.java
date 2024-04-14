package com.example.bookstore.order;

import lombok.Data;

@Data
public class PlaceOrder {
    private int bookId;
    private String name;
    private String surname;
    private String phoneNumber;
    private int houseNumber;
    private int flatNumber;
    private String street;
    private String postalCode;
    private String city;
    private String email;

}
