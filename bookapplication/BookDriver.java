package com.jsp.bookapplication;

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Book Application -----");
		Book b1=new Book("Indian History","GK",1234);
		b1.setAuthor(new Author("Palestine","pale02@gmail.com",8907688090l));
		b1.getAuthor().setAddress(new Address("Sector -2", "Navi Mumbai", "Maharashtra"));
		
		b1.printBookDetails();
		
	}

}
