package com.jsp.square_patterns1;

import java.util.Scanner;

public class SquarePattern9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}

	}
}
