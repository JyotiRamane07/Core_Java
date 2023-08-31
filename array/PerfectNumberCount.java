package com.jsp.array;

import java.util.Scanner;

public class PerfectNumberCount {
	public static boolean isPerfectNumber(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static int perfectNumberCount(int arr[])
	{
		int pc=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isPerfectNumber(arr[i])==true)
			{
				pc++;
			}
		
	}
	return pc;	
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
		int count =perfectNumberCount(arr);
		System.out.println("Count of perfect numbers in array: "+count);
	}
}
