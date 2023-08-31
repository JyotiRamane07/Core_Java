package com.jsp.exception;

import java.util.Scanner;
public class Matrimony {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your present age");
	int age=sc.nextInt();
	
	if(age<=20)
	{ //throw exception
		try {
			throw new UnderAgeException();
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	else if(age>40)
	{
		//throw exception
		try
		{
			throw new OverAgeException();
		}
		catch(OverAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	else
	{
		System.out.println("Good to go...");
	}
}
}
