package com.jsp.constructors;

public class Marker {
	// variable declaration
	double price; 
	static String brand="Camlin";
	String name;
	String color;// properties/attributes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Marker m1=new Marker(); 
	m1.price=5;
	m1.name="Marker_1";
	m1.color="Red";
	System.out.println("-----Marker_1-----");
	System.out.println(m1.brand+" is the brand");
	System.out.println(m1.name+" is name");
	System.out.println(m1.color+" is the marker_1 color");
	System.out.println(m1.price+ " is the price of marker_1");
	
	Marker m2=new Marker(); 
	m2.name="Marker_2";
	m2.color="Black";
	System.out.println("-----Marker_2-----");
	System.out.println(m2.brand+" is the brand");
	System.out.println(m2.name+" is name");
	System.out.println(m2.color+" is the marker_2 color");
	System.out.println(m2.price+ " is the price of marker_2");
	
	Marker m3=new Marker(); 
	m3.price=5;
	m3.name="Marker_3";
	System.out.println("-----Marker_3-----");
	System.out.println(m3.brand+"is the brand");
	System.out.println(m3.name+" is name");
	System.out.println(m3.color+" is the marker_3 color");
	System.out.println(m3.price+ " is the price of marker_3");
	

	}

}
