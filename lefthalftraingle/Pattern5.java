package com.jsp.lefthalftraingle;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
