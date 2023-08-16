package com.jsp.logicalprograms;
 import java.util.Scanner;
public class PrimeRange {
	
	public static void printPrimeRange(int n) {
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int range=sc.nextInt();
		System.out.println("Prime numbers upto " +range + " are :");
		printPrimeRange(range);

	}

}

