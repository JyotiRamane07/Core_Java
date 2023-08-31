package com.jsp.exception;

import java.util.Scanner;

public class FinallyBlock {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter two numbers");
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	try
	{
		int res=n/m;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	//finally block
	finally
	{
		System.out.println("Finally Block Executes with or without occuring exception...");
	}
}
}
