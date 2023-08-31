package com.jsp.square_patterns1;

import java.util.Scanner;
	public class SquarePattern3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.err.println("Enter size:");
			int n=sc.nextInt();
			int t=1;
			for(int i=1;i<=n;i++)
			{
				
				for(int j=1;j<=n;j++)
				{
					System.out.print(t%2);
					t++;
				}
				
				System.out.println();
			}

		}
	}
