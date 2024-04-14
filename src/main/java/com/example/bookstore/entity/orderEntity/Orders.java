package com.example.bookstore.entity.orderEntity;

import com.example.bookstore.entity.book.Book;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int orderId;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private String surname;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="house_number")
    private int houseNumber;

    @Column(name="flat_number")
    private int flatNumber;

    @Column(nullable = false)
    private String street;

    @Column(name="postal_code")
    private String postalCode;


    @Column
    private String city;

    @Column
    private LocalDate date;


    @JoinColumn(name = "book_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;
}
