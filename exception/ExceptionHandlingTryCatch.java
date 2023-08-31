package com.jsp.exception;

public class ExceptionHandlingTryCatch {
	public static void main(String[] args) {
		int m=12;
		int n=0;
		try
		{
		System.out.println(m/n); // this statement cause exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception is handled");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}