package com.author.service.AuthorService.Service;

import java.util.List;

import com.author.service.AuthorService.Entity.Author;
import com.author.service.AuthorService.model.BooksAndAuthor;

public interface AuthorServiceInterf {
	
	public Author addAuthor(Author author);
	
	public List<Author> getAllAuthorsRecord();
	
	public Author getAuthor(int id);
	
	public Author getAuthorByName(String author);

}
