package com.jsp.string;

import java.util.Scanner;

public class SubString {
	
	public static void subString(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		System.out.println("Substring of given strings are : ");
		subString(s);
		
	}

}
