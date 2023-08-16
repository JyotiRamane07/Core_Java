package com.jsp.constructors;

public class Pen1 {

	// variable declaration
				double price; 
				static String brand="Camlin";
				String name;
				String color;
// No argument user defined constructor
	public Pen1()
	{
		System.out.println("No argument constructor is called");
	}
// Argumented /Parameterized constructor 	
	public Pen1(double pr, String nm,String c)
	{
		this.price=pr;
		this.name=nm;
		this.color=c;
		
	}
	

}
