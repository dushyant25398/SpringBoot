package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;


@RestController
public class ControllerLib {
	
	@GetMapping("/home")
	public String home() {
		return "this is checking";
	}
	 @Autowired    // we will tell spring boot to create a dependency injection to send values from courseServcie to CourseService variable and create @service annotation in courseServiceimpl class.
	 private BookService bookService;
	
	
	
	// get all the books
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return this.bookService.getBooks();
		}
	// get Information about single book
//	@GetMapping("/book/{bookName}")  // this is used to pass the value through postman
//	public Book getBook(@PathVariable String bookname ) {
//		return this.bookService.getbook(bookname);
//		}
	@GetMapping("/book/{bookName}")
	public ResponseEntity<List<Book>> searchbookName(@PathVariable String name){
		return ResponseEntity.ok(bookService.searchbookName(name));
	}
//    to add new books 
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {    // we  want this from the body so annotation @Requestbody is used 
		return this.bookService.addBook(book);
	}


}


