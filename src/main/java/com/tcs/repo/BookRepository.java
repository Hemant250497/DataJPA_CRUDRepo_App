package com.tcs.repo;
import com.tcs.entity.Book;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {

    public List<Book> findByBookPriceGreaterThan(Double price);
    public List<Book> findByBookName(String bookName);

    @Query(value="select * from book", nativeQuery = true)
    public List<Book> AllBooks();

    @Query("from Book")
    public List<Book> getBooks();

}
