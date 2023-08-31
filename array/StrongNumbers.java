package com.jsp.array;

import java.util.Scanner;

public class StrongNumbers {
	public static boolean isStrongNumber(int n)
	{
		int temp=n;
		
		int sum=0;
		while(temp>0)
		{
			int ldig=temp%10;
			int fact=1;
			for(int i=1;i<=ldig;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
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
	public static int strongNumberCount(int arr[])
	{
		int sc=0;
	for(int i=0;i<arr.length;i++)
	{
		if(isStrongNumber(arr[i])==true)
		{
			sc++;
		}
		
	}
	return sc;	
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
		int count = strongNumberCount(arr);
		System.out.println("Count of strong numbers in array: "+count);
	}

}
