package com.jsp.logicalprograms;

import java.util.Scanner;
public class StrongNumber {
	public void isStrongNumber(int n)
	{
		int sum=0;
		int temp=n;
		
		while(n>0)
		{
			int ldig=n%10;
			int fact=1;
			for(int i=1;i<=ldig;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
	
		
		if(sum==temp)
		{
			System.out.println(temp+ " Is a strong number");
		}
		else
		{
			System.out.println(temp+" Is not a strong number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrongNumber s1=new StrongNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		s1.isStrongNumber(n);
		
	}

}
