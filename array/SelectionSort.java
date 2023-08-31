package com.jsp.array;

import java.util.Scanner;

public class SelectionSort {
	public static int[] selectionSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
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
		int a[]=selectionSort(arr);
		for(int num:a)
		{
			System.out.println(num+" ");
		}
	}
}
