package com.jsp.bookapplication;

public class Book {
	private String name;
	private String genre;
	double price;
	
	private Author author;
	
	public Book(String name,String genre,double price)
	{
		this.name=name;
		this.genre=genre;
		this.price=price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void printBookDetails()
	{
		System.out.println("---Book Details---"
				+ "");
		System.out.println("Book name : "+name);
		System.out.println("Genre : "+genre);
		System.out.println("Book Price : "+price);
		
		if(author!=null)
		{
			author.printAuthorDetails();
		}
		else
		{
			System.out.println("Author Details Are Present");
		}
	}

}
