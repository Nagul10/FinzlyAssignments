package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "library")
public class Library {
	
	@Id
	private int isbn;
	private String title;
	private String author;
	private int publicationYear;
	
	public Library() {
		super();
	}
	
	public Library(int isbn, String title, String author, int publicationYear) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Library [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publicationYear="
				+ publicationYear + "]";
	}
	
	
	

}
