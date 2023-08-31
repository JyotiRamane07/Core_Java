package com.jsp.array;

import java.util.Scanner;

public class InsertionSort {
	public static int[] insertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int current=arr[i];
			int j=i-1;
				while(j>=0 && current<arr[j])
				{
					arr[j+1]=arr[j];
					j--;
				}
			arr[j+1]=current;
		}

		return arr;
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
		System.out.println("Array after sorting:");	
		int a[]=insertionSort(arr);
		for(int num:a)
		{
			System.out.println(num+" ");
		}
	}
}
