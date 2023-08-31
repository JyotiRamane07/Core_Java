package com.jsp.string;

import java.util.Scanner;

public class SumDigit {
	public static int sumDigit(String s)
	{
		int sum=0;
		char ch[]=s.toCharArray();
		String num="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				num=num+ch[i];
			}
		}
		int number=Integer.parseInt(num);
		while(number>0)
		{
			sum=sum+number%10;
			number=number/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
		System.out.println("Sum of digits present in given String is :"+sumDigit(s));
	}
}
