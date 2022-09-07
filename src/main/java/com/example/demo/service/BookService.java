package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;



public interface BookService {
	
	public List<Book> getBooks();



    public Book addBook(Book book);

	//public Book getbook(String bookname);
    List<Book> searchbookName(String name);
	

}
