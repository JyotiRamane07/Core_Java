package com.jsp.string;

import java.util.Scanner;

public class ReverseEachWord {
	public static void reverseWords(String str)
	{
		String s[]=str.split(" ");
		String reversestring="";
		for(int i=0;i<s.length;i++)
		{
			String str2=s[i];
			String revword="";
			for(int j=str2.length()-1;j>=0;j--)
			{
				revword=revword+str2.charAt(j);
			}
			reversestring=reversestring+" "+revword;
		}
		System.out.println("After reversing Each word from given String: "+reversestring);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A string");
		String s=sc.nextLine();
        reverseWords(s);
		
	}
}
