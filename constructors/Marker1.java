package com.jsp.constructors;

public class Marker1 {

	// variable declaration
			double price; 
			static String brand="Camlin";
			String name;
			String color;// properties/attributes
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marker1 m1=new Marker1();
		System.out.println("-----Marker_1-----");
		System.out.println(m1.brand);
		System.out.println(m1.name);
		System.out.println(m1.color);
		System.out.println(m1.price);
		
	}

}
