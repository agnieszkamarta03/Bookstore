package com.example.bookstore.repository;

import com.example.bookstore.entity.book.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query("SELECT b FROM Book b " +
            "WHERE (:genre is null or b.genre = :genre) " +
            "AND (b.price >= :startPrice) and (b.price <= :endPrice) " +
            "AND (:cover is null or b.coverType = :cover) " +
            "AND (b.pages >= :minPages) and (b.pages <= :maxPages)" +
            "AND (b.author is null or b.author = :author)")
    Page<Book> findSpecificBook(String genre, double startPrice, double endPrice, String cover, int minPages, int maxPages,String author, PageRequest pageRequest);

    @Query("SELECT b.stock FROM Book b WHERE b.id = :bookId")
    Integer getBookStock(Integer bookId);

    @Query("SELECT b.stock FROM Book b WHERE b.id = (:bookId)")
    Integer getStockForWardrobe(int bookId);

}
