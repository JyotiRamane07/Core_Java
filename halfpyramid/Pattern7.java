package com.jsp.halfpyramid;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("====================================================================");
		for(int i=1;i<=n;i++)
		{
			for(int sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			int k=1;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(k);
				if(j<i)
				{
					k++;
				}
				else
				{
					k--;
				}
			}
			System.out.println();
		}
	}
}
