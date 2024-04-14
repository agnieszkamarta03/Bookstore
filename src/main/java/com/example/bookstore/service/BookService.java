package com.example.bookstore.service;

import com.example.bookstore.entity.book.Book;
import com.example.bookstore.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService implements com.example.bookstore.service.Service {
    private static final int PAGE_RESULT_SIZE = 30;
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Page<Book> getAllBooks(int page) {
        PageRequest pageRequest = createPageRequest(page);
        return bookRepository.findAll(pageRequest);
    }

    @Override
    public Book findById(int id){
        if (id < 0)
            throw new IllegalArgumentException("Id can not be less than 0");

        Optional<Book> result = bookRepository.findById(id);
        Book book = null;

        if (result.isPresent()) {
            book = result.get();
        } else {
            throw new RuntimeException("No book with id : " + id);
        }

        return book;
    }

    @Override
    public Page<Book> findSpecificBooks(BookSearchOptions bookSearchOptions, int page) {
        PageRequest pageRequest = createPageRequest(page);
        return bookRepository.findSpecificBook(
                bookSearchOptions.getGenre(),
                bookSearchOptions.getMinPrice(),
                bookSearchOptions.getMaxPrice(),
                bookSearchOptions.getCover(),
                bookSearchOptions.getMinPages(),
                bookSearchOptions.getMaxPages(),
                bookSearchOptions.getAuthor(),
                pageRequest);

    }

    @Override
    public int getStock(int id) {
        return bookRepository.getBookStock(id);

    }

    public PageRequest createPageRequest(int page) {
        if (page < 0) {
            throw new IllegalArgumentException("Page number is incorrect");
        }
        return PageRequest.of(page, PAGE_RESULT_SIZE);
    }

    @Override
    @Transactional
    public int editBook(BookEditRequest bookEditRequest) {
        int id = bookEditRequest.getId();
        Book book = (Book) bookRepository.findById(id).orElse(new Book());
        updateBook(bookEditRequest, book);
        Book newBook = (Book) bookRepository.save(book);
        return newBook.getId();
    }


    public void updateBook(BookEditRequest bookEditRequest, Book book) {
        book.setTitle(bookEditRequest.getTitle());
        book.setAuthor(bookEditRequest.getAuthor());
        book.setPages(bookEditRequest.getPages());
        book.setCoverType(bookEditRequest.getCoverType());
        book.setGenre(bookEditRequest.getGenre());
        book.setPrice(bookEditRequest.getPrice());
        book.setImgUrl(bookEditRequest.getImgUrl());
        book.setStock(bookEditRequest.getStock());
    }

    @Override
    @Transactional
    public void deleteBook(int id) {
        Book book = findById(id);

        bookRepository.delete(book);
    }
}
