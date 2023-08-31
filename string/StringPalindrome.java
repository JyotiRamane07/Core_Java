package com.jsp.string;

import java.util.Scanner;

public class StringPalindrome {
	public static boolean isPalindrome(String s)
	{
		int low=0;
		int high=s.length()-1;
		while(low<high)
		{
			if(s.charAt(low)!=s.charAt(high))
			{
				return false;
			}
			else
			{
				low++;
				high--;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
		if(isPalindrome(s)==true)
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}
	}
}
