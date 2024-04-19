package com.example.bookstore.repository;

import com.example.bookstore.entity.orderEntity.Orders;
import com.example.bookstore.orderRaport.InfoReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer> {


    @Query("SELECT o FROM Orders o ORDER BY o.date ASC")
    List<Orders> getOrdersByDateAsc();

    @Query(nativeQuery = true, value = """
            SELECT b.id                      as bookId,
                   'The most sold book'      as reportCategory,
                   b.title                     as title,
                   COUNT(*)                  as soldNum,
                   SUM(b.price)                as profit
            FROM Orders o JOIN Book b on o.book_id = b.id
            WHERE o.date >= :startDate AND o.date <= :endDate
            GROUP BY b.id
            ORDER BY soldNum DESC
            limit 1;
            """)
    InfoReport getTheMostSoldBook(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    @Query(nativeQuery = true, value = """
            SELECT b.id,
                   'The least sold book',
                   b.title,
                   COUNT(*),
                   SUM(b.price)
            FROM Orders o JOIN Book b on o.book_id = b.id
            WHERE o.date >= :startDate AND o.date <= :endDate
            GROUP BY b.id
            ORDER BY count(*) DESC
            limit 1;
            """)
    InfoReport getTheLeastSoldBook(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);




}
