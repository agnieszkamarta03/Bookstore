package com.example.bookstore.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookEditRequest {

    private int id;
    private String title;
    private String author;
    private int pages;
    private String coverType;
    private String genre;
    private double price;
    private String imgUrl;
    private int stock;
}
