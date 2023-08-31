package com.jsp.string;

import java.util.Scanner;

public class ReverseWords {
	public static void reverseWords(String str)
	{
		String s[]=str.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+ " ");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A string");
		String s=sc.nextLine();
        reverseWords(s);
		
	}
}
