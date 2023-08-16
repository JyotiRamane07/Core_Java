package com.jsp.logicalprograms;

import java.util.Scanner;

public class Fibonaccie {
	public static void fibonaccieSeries(int n)
	{
		int z=0;
		int x=0;
		int y=1;
		while(z<=n) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int n=sc.nextInt();
		fibonaccieSeries(n);
	}

}
