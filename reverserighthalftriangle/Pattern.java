package com.jsp.reverserighthalftriangle;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
