package com.jsp.exception;

public class DemoExceptions {

	public static void main(String[] args) {
		int m=24;
		int n=2;
		String s=" ";
		
		//Exception Handling Using try catch block
		try
		{
			int res=m/n;
			System.out.println(res);
			char c=s.charAt(5);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch(StringIndexOutOfBoundsException ie)
		{
			System.out.println(ie.getMessage());
		}

	}

}
