package com.jsp.array;

import java.util.Scanner;

public class BubbleSort {
	public static int[] bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
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
		int a[]=bubbleSort(arr);
		for(int num:a)
		{
			System.out.println(num+" ");
		}
	}
}
