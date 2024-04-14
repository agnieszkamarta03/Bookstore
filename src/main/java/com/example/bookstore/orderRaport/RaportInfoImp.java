package com.example.bookstore.orderRaport;


public class RaportInfoImp implements RaportInfo {
    private Integer bookId;
    private String raportCategory;
    private String title;
    private Integer soldNum;
    private Double profit;

    @Override
    public int getBookId() {
        return bookId;
    }

    @Override
    public String getCategory() {
        return raportCategory;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Integer getSold() {
        return soldNum;
    }

    @Override
    public Double getProfit() {
        return profit;
    }
}
