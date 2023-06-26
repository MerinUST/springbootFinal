package com.example.demo.bookRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

}
