package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.dao.BookRepository;
import com.example.demo.dao.LibraryRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.entity.Book;
import com.example.demo.entity.Library;
import com.example.demo.entity.User;


@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired 
	private LibraryRepository libraryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		// user profile

		    User user =  new User();
	        user.setEmail("divyam@gmail.com");
	        user.setEmpName("divyam");
	        
      // book profile			
		   			
			Book book = new Book();
			book.setAuthorName("H.V Verma ");
			book.setBookName("Physics");

			
		
			user.setBook(book);
			book.setUser(user);
//			
//			Library lib = new Library();
//			lib.setAuthorName("H.C Verma");
//			lib.setAvailable(true);
//			lib.setBookname("Physics");
//			
//			
//			
//			libraryRepository.save(lib);
		    
			bookRepository.save(book);
		// TODO Auto-generated method stub
		
		
	}

	


}
