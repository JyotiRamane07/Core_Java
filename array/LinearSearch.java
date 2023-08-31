package com.jsp.array;

import java.util.Scanner;

public class LinearSearch {
	public static int searchElement(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements:");
		for (int i = 0; i <arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search:");
		int key=sc.nextInt();
		System.out.println("Element is present at index:"+searchElement(arr,key));
	
		
	}
}

