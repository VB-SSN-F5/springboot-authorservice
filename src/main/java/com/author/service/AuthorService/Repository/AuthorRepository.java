package com.author.service.AuthorService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.service.AuthorService.Entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Object> {
	
	public Author findByName(String author);

}
