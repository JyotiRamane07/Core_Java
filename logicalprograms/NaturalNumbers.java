package com.jsp.logicalprograms;
import java.util.Scanner;
public class NaturalNumbers {

	public static void naturalNumbers(int start,int end_limit)
	{
		for(int i=start;i<=end_limit;i++)
		{
			System.out.println(i);
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start and end to print natural numbers:");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		naturalNumbers(start,end);
		
	}

}
