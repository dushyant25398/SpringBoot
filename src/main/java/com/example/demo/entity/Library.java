package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "library")
public class Library {
	

	
	@Id
	@Column(name= "serial key")
	private Long id;
	
	private String bookname ;
	
	private String authorName;
    
	@Transient
	private boolean isAvailable;
	
	public Library() {
	}
	

	public Library(Long id, String bookname, String authorName, boolean isAvailable) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.authorName = authorName;
		this.isAvailable = isAvailable;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	@Override
	public String toString() {
		return "Library [id=" + id + ", bookname=" + bookname + ", authorName=" + authorName + ", isAvailable="
				+ isAvailable + "]";
	}
		
	
}// TODO Auto-generated constructor stub
	