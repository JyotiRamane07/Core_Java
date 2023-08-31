package com.jsp.halfpyramid;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(k%2);
				k++;
			}
			System.out.println();
		}
	}
}
