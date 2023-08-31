package com.jsp.string;
import java.util.Scanner;
public class StringReverse {
public static String reverseString(String s)
{
	String rev="";
	for(int i=0;i<s.length();i++) {
		rev=s.charAt(i)+rev;
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
