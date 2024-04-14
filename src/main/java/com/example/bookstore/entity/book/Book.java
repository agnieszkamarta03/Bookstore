package com.example.bookstore.entity.book;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    public Book() {}

    public Book(int id, String title, String author, int pages, String coverType, String genre, double price, String imgUrl, int stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.coverType = coverType;
        this.genre = genre;
        this.price = price;
        this.imgUrl = imgUrl;
        this.stock = stock;
    }

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="pages")
    private int pages;


    @Column(name="cover_type")
    private String coverType;

    @Column(name="genre")
    private String genre;

    @Column(name="price")
    private double price;

    @Column(name="img_url")
    private String imgUrl;

    @Column(name="stock")
    private int stock;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

