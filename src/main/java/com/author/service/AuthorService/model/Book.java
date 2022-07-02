package com.author.service.AuthorService.model;

public class Book {
	
	private int id;
	
	private String name;
	
	private String summary;

	private int rating;
	
	private String author;
	
	public Book()
	{
		super();
	}

	public Book(int id, String name, String summary, int rating, String author) {
		super();
		this.id = id;
		this.name = name;
		this.summary = summary;
		this.rating = rating;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + id + ", name=" + name + ", summary=" + summary + ", rating=" + rating + "]";
	}

}
