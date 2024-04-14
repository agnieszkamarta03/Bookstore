package com.example.bookstore.controller;

import com.example.bookstore.entity.book.Book;
import com.example.bookstore.exception.BookNotFoundException;
import com.example.bookstore.service.BookEditRequest;
import com.example.bookstore.service.BookSearchOptions;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {
    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{page}")
    public ResponseEntity<BookResponse> getAllBooks(@PathVariable int page){
        Page<Book> book = bookService.getAllBooks(page);
        BookResponse bookResponse = new BookResponse(book.getTotalPages(),book.getContent());
        return ResponseEntity.ok(bookResponse);

    }

    @PostMapping("/filtered/{page}")
    public ResponseEntity<BookResponse> findSpecificBooks(
            @PathVariable int page,
            @RequestBody BookSearchOptions bookSearchOptions
            ){
        Page<Book> book = bookService.findSpecificBooks(bookSearchOptions,page);
        BookResponse bookResponse = new BookResponse(book.getTotalPages(),book.getContent());
        return ResponseEntity.ok(bookResponse);
    }

    @PutMapping("/edit")
    public ResponseEntity<Map<String, Book>> editBook(@RequestBody BookEditRequest bookEditRequest){
        int bookId = bookService.editBook(bookEditRequest);
        Book editedBook = bookService.findById(bookId);

        Map<String, Book> response = new HashMap<>();
        response.put("Edited book",editedBook);
        return ResponseEntity.ok(response);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Integer>> deleteBook(@PathVariable int id){
        Book bookToDelete = bookService.findById(id);
        if(bookToDelete == null){
            throw new BookNotFoundException("Book with id " + id + "does not exist");
        }
       bookService.deleteBook(id);
        Map<String,Integer> response = new HashMap<>();
        response.put("Deleted id",id);
        return ResponseEntity.ok(response);

    }
}
