package com.jsp.square_patterns1;

import java.util.Scanner;

public class SPattern {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int sp=1;sp<=n-i;sp++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=n;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
