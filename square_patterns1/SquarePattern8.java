package com.jsp.square_patterns1;

import java.util.Scanner;

public class SquarePattern8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}

	}
}
