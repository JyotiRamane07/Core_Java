package com.jsp.string;

import java.util.Scanner;

public class CaseConversation {
	public static String caseConvert(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&& ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
		System.out.println("After changing case of string:"+caseConvert(s));
	}
}
