package com.jsp.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static int reverseNumber(int n)
	{	
		int rev=0;
		while(n>0)
		{
		int temp=n%10;
		rev=rev*10+temp;
		n=n/10;
		}
		return rev;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number to reverse:");
			int n=sc.nextInt();
			System.out.println("After reversing number :" +reverseNumber(n));
		
	}

}
