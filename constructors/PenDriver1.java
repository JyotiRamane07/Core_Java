package com.jsp.constructors;

public class PenDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Argumented constructor is called ");
		Pen1 p2=new Pen1();//constructor calling statement
	      //it calls no argument user defined constructor
	      System.out.println(p2.name);
	      
	      
	   
	      
	      
	   System.out.println("Argumented constructor is called ");
	     
	   Pen1 p3=new Pen1(5,"Cello","Blue");//constructor calling statement
	      //it calls argumented user defined constructor
	   System.out.println(p3.name);
	   System.out.println(Pen1.brand);
	   System.out.println(p3.color);
	   System.out.println(p3.price);

	}

}
