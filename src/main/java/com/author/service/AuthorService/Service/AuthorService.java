package com.author.service.AuthorService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.service.AuthorService.Entity.Author;
import com.author.service.AuthorService.Repository.AuthorRepository;
import com.author.service.AuthorService.model.BooksAndAuthor;

@Service
public class AuthorService implements AuthorServiceInterf{
	
	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public Author addAuthor(Author author) {
		Author newAuthor = authorRepository.save(author);
		return newAuthor;
	}

	@Override
	public List<Author> getAllAuthorsRecord() {
		List<Author> authorRecords = authorRepository.findAll();
		return authorRecords;
	}

	@Override
	public Author getAuthor(int id) {
		Author author = authorRepository.findById(id).get();
		return author;
	}

	@Override
	public Author getAuthorByName(String author) {
		 Author authorRecord = authorRepository.findByName(author);
		 return authorRecord;
	}

	

}
