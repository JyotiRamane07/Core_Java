package com.jsp.array;

import java.util.Scanner;

public class ReverseOfArray {
	public static void reverseOfArray(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
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
		System.out.println("Reverse of array elements : ");
		
		reverseOfArray(arr);
	}
}
