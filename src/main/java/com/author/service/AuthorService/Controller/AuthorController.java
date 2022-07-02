package com.author.service.AuthorService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.author.service.AuthorService.Entity.Author;
import com.author.service.AuthorService.Service.AuthorServiceInterf;
import com.author.service.AuthorService.model.Book;
import com.author.service.AuthorService.model.BooksAndAuthor;

@RestController
@RequestMapping("/author")
public class AuthorController {
	
	@Autowired
	private AuthorServiceInterf authorService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Author>> getAllAuthors()
	{
		List<Author> authorRecords = authorService.getAllAuthorsRecord();
		return new ResponseEntity<>(authorRecords, HttpStatus.OK);
	}
	
	@GetMapping("id/{authorId}")
	public ResponseEntity<Author> getAuthorId(@PathVariable("authorId") int authorId)
	{
		Author authorRecord = authorService.getAuthor(authorId);
		return new ResponseEntity<>(authorRecord, HttpStatus.OK);
	}
	
	/* Get List of Books written by Autor by using Author ID */
//	@GetMapping("id/{authorId}")
//	public ResponseEntity<BooksAndAuthor> getAuthorId(@PathVariable("authorId") int authorId)
//	{
//		Author authorRecord = authorService.getAuthor(authorId);
//		String authorName = authorRecord.getName();
//		List<Book> listOfBooks = restTemplate.getForObject("http://LIBRARY-SERVICE/book/author/"+authorName, List.class);
//		
//		BooksAndAuthor booksReturnByAuthor = new BooksAndAuthor(authorRecord, listOfBooks);
//		
//		return new ResponseEntity<>(booksReturnByAuthor, HttpStatus.OK);
//	}
	
	@GetMapping("books/{authorName}")
	public ResponseEntity<BooksAndAuthor> getBoksWrittenByAuthor(@PathVariable("authorName") String authorName)
	{
		Author authorRecord = authorService.getAuthorByName(authorName);
		List<Book> listOfBooks = restTemplate.getForObject("http://LIBRARY-SERVICE/book/author/"+authorName, List.class);
		BooksAndAuthor booksReturnByAuthor = new BooksAndAuthor(authorRecord, listOfBooks);
		return new ResponseEntity<>(booksReturnByAuthor, HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Author> createAuthorRecord(@RequestBody Author authorRecord)
	{
		Author newAuthorRecord = authorService.addAuthor(authorRecord);
		return new ResponseEntity<>(newAuthorRecord, HttpStatus.CREATED); 
	}

}
