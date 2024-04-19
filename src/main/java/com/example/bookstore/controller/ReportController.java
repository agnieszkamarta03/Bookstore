package com.example.bookstore.controller;

import com.example.bookstore.orderRaport.InfoReport;
import com.example.bookstore.orderRaport.ReportRequestTimeline;
import com.example.bookstore.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {
    ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }


    @PostMapping("/report")
    public ResponseEntity<List<InfoReport>> getReport(@RequestBody ReportRequestTimeline reportRequestTimeline){
        List<InfoReport> report = reportService.getBookStoreReport(reportRequestTimeline);
        return ResponseEntity.ok(report);
    }
}
