package com.author.service.AuthorService.model;

import java.util.List;

import com.author.service.AuthorService.Entity.Author;

public class BooksAndAuthor {
	
	private Author author;
	
	private List<Book> booksWritten;

	public BooksAndAuthor() {
		super();
	}

	public BooksAndAuthor(Author author, List<Book> booksWritten) {
		super();
		this.author = author;
		this.booksWritten = booksWritten;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Book> getBooksWritten() {
		return booksWritten;
	}

	public void setBooksWritten(List<Book> booksWritten) {
		this.booksWritten = booksWritten;
	}

}
