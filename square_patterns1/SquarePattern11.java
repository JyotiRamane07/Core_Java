package com.jsp.square_patterns1;

import java.util.Scanner;

public class SquarePattern11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==n || j==n || i==j || i+j==n+1) {
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
			}
			System.out.println();
		}

	}
}
