package com.jsp.exception;

public class ExceptionHandlingUsingThrows {

	public static void main(String[] args)throws ArithmeticException, StringIndexOutOfBoundsException {
		//Exception Handling Using throws keyword
		int m=24;
		int n=10;
		String s=" ";
		System.out.println(m/n);
		System.out.println(s.charAt(5));


	}

}
