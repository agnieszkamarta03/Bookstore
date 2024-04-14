package com.example.bookstore.service;

import com.example.bookstore.entity.book.Book;
import org.springframework.data.domain.Page;

public interface Service {
    public Page<Book> getAllBooks(int page);
    public Book findById(int id) throws Throwable;

    public Page<Book> findSpecificBooks(BookSearchOptions bookSearchOptions, int page);

    public int getStock(int id);
    public int editBook(BookEditRequest bookEditOptions);
    public void deleteBook(int id);



}
