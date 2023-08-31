package com.jsp.righthalftriangle;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int sp=1;sp<=i-1;sp++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
