package com.jsp.logicalprograms;
import java.util.Scanner;
public class SwapNumber {
	public static void SwapNumber(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Numbers After swapping:");
		System.out.println("a : "+a+" b : "+b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to swap:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Numbers before swappnig");
		System.out.println("a : "+a+ " b : "+b);
		SwapNumber(a,b);
		
	}

}
