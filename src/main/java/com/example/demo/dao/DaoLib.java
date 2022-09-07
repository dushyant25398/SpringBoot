package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Book;

public interface DaoLib extends JpaRepository<Book, Long> {
    
	//search
	
	@Query("SELECT p from Book WHERE "+ "p.bookName LIKE CONCAT('%',:bookName,'%')")
	public List<Book> searchbookName(String name);
}
