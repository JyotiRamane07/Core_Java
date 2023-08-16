package com.jsp.constructors;

public class CalculatorDriver {
	public static void main(String arg[])
	{
		//calling static method by its classname
		Calculator.addTwoNumbers(30,50);
		
		//calling a static method by its object reference
		Calculator c1=new Calculator();
		int r=c1.subTwoNumbers(40,70);
		System.out.println(r);
		
		// calling a non static method by its object reference
		int pro=c1.mulTwoNumbers(12,30);
		System.out.println(pro);
		
		//calling a non static method by its object reference
		c1.divideTwoNumbers(30,2);
	}
}
