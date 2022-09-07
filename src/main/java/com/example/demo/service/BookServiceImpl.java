package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoLib;
import com.example.demo.entity.Book;

@Service
public class BookServiceImpl implements BookService {

	
	
	@Autowired
	private DaoLib dow;
	//List <Book> list;
	public BookServiceImpl() {
		
//		   // constructor to run in initializing of these objects at the start time.
//			list = new  ArrayList<>();     // create array list
//			list.add(new Book(1,"Ncert","Esy book",false));
//			list.add(new Book(2,"python","progarmming book",true));
//			
			
	}
	
	// fetch all the books
	@Override
	public List<Book> getBooks() {
		return dow.findAll();
	}

//	// fetch book by name 
//	@Override
//	public Book getbook(String bookname) {
//		// TODO Auto-generated method stub
//		dow.findOne(bookname);
//	}

	
	// to add a book	
	@Override
	public Book addBook(Book book) {
		dow.save(book);
		
		return book;
	}

	@Override
	public List<Book> searchbookName(String name) {
	    List<Book> book = dow.searchbookName(name);
		return book;
	}

	
}

