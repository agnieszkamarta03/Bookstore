package com.example.bookstore.orderRaport;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class RaportRequestTimeline {
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
}
