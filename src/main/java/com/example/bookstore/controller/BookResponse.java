package com.example.bookstore.controller;

import com.example.bookstore.entity.book.Book;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookResponse {
    private Integer maxPages;
    private List<Book> booksInPage;

    public BookResponse(Integer maxPages, List<Book> booksInPage) {
        this.maxPages = maxPages;
        this.booksInPage = booksInPage;
    }
}
