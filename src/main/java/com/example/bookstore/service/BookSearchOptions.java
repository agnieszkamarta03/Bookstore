package com.example.bookstore.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookSearchOptions {
    private String title;
    private String genre;
    private double minPrice;
    private double maxPrice;
    private String cover;
    private int minPages;
    private int maxPages;
    private String author;

}

