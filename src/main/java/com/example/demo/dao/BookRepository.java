package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
	//search
	
//	@Query("SELECT p from Book WHERE "+ "p.bookName LIKE CONCAT('%',:bookName,'%')")
//	public List<Book> searchbookName(String name);
}
