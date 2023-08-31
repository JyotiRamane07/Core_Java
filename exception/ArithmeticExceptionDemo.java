package com.jsp.exception;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		int m=24;
		int n=0;
		try
		{
			int res=m/n;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}

	}

}
