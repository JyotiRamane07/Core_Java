package com.jsp.Pyramid;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size:");
		int n=sc.nextInt();
		int sp=n/2;
		int st=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=sp;s++)
			{
				System.out.print(" ");
			}
			int k=1;
			for(int j=1;j<=st;j++)
			{	
				
				if(j==1 || j==st)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
				if(i<=n/2)
				{
					sp--;
					st=st+2;
				}
				else
				{
					st=st-2;
					sp++;
				}
		
			System.out.println();
		}
	}
}
