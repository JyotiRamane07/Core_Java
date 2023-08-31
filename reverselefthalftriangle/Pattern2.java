package com.jsp.reverselefthalftriangle;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		int k=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=k;j--) 
			{	
				System.out.print(j);
			}
			k++;
			System.out.println();
		}
	}
}
