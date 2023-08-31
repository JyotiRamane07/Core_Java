package com.jsp.array;

import java.util.Scanner;                                                             

public class ArmstrongNumbers {
	public static boolean isArmstrong(int n)
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
		}
		if(sum==n)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static int armstrongCount(int arr[])
	{
		int ac=0;
	for(int i=0;i<arr.length;i++)
	{
		if(isArmstrong(arr[i])==true)
		{
			ac++;
		}
		
	}
	return ac;	
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		int count = armstrongCount(arr);
		System.out.println("Count of armstrong numbers in array: "+count);
	}
}