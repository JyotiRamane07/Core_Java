package com.jsp.logicalprograms;

import java.util.Scanner;
public class DiseriumNumber {

	public static void diseriumNumber(int n)
	{
		
			
			int temp=n;
			int count=0;
			int sum=0;
			
			while(temp>0) {
				temp=temp/10;
				count++;
				
			}
			temp=n;
			
			while(temp>0)
			{
				int pro=1;
				int ldigit=temp%10;
				for(int i=1;i<=count;i++)
				{
					pro=pro*ldigit;
					
				}
				sum=sum+pro;
				temp=temp/10;
				count--;
			}
			if(sum==n)
			{
				System.out.println(n+ " is diserium number");
			}
			else
			{
				System.out.println(n+ " is not a diserium Number");
			}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int n=sc.nextInt();
		diseriumNumber(n);

	}

}
