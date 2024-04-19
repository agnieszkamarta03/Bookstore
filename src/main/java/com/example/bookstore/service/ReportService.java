package com.example.bookstore.service;


import com.example.bookstore.orderRaport.InfoReport;
import com.example.bookstore.orderRaport.ReportRequestTimeline;
import com.example.bookstore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {
    OrderRepository orderRepository;

    @Autowired
    public ReportService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<InfoReport> getBookStoreReport(ReportRequestTimeline reportRequestTimeline){
        List<InfoReport> report = new ArrayList<>();
        report.add(orderRepository.getTheMostSoldBook(reportRequestTimeline.getStartDate(),reportRequestTimeline.getEndDate()));
        report.add(orderRepository.getTheLeastSoldBook(reportRequestTimeline.getStartDate(),reportRequestTimeline.getEndDate()));
        return report;
    }
}

