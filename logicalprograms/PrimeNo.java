package com.jsp.logicalprograms;
import java.util.Scanner;
public class PrimeNo {

	public static void isPrimeNumber(int n) 
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
		
			{
				count++;
			}
		}
		if(count==2)
		{
		System.out.println(n+ " Is a prime number");
		}
		else
		{
			System.out.println(n+ " Is not a prime number");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();	
		isPrimeNumber(n);

	}

}
