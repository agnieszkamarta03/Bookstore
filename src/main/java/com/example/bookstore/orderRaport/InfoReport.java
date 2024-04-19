package com.example.bookstore.orderRaport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class InfoReport {
    private Integer bookId;
    private String reportCategory;
    private String title;
    private Integer soldNum;
    private Double profit;

    public InfoReport(Integer bookId, String reportCategory, String title, Integer soldNum, Double profit) {
        this.bookId = bookId;
        this.reportCategory = reportCategory;
        this.title = title;
        this.soldNum = soldNum;
        this.profit = profit;
    }
}
