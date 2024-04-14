package com.example.bookstore.repository;

import com.example.bookstore.entity.orderEntity.Orders;
import com.example.bookstore.orderRaport.RaportInfo;
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
                   'The most sold book'      as raportCategory,
                   title                     as title,
                   COUNT(*)                  as soldNum,
                   SUM(price)                as profit
            FROM Orders JOIN Book b on orders.book_id = b.id
            WHERE date(date) >= :startDate AND date(date) <= :endDate
            GROUP BY id
            ORDER BY soldNum DESC
            limit 1;
            """)
    RaportInfo getTheMostSoldBook(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);


}
