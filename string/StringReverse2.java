package com.jsp.string;

import java.util.Scanner;

public class StringReverse2 {
	public static String reverseString(String s)
	{
		String rev="";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		System.out.println("After reversing a string : "+reverseString(s));
		
	}
}