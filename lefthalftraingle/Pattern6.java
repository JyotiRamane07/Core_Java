package com.jsp.lefthalftraingle;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
