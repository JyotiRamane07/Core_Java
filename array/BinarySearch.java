package com.jsp.array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void searchElement(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==key)
			{
				System.out.println("Element is present at :"+(mid+1)+"th index");
				break;
			}
			else if(arr[mid]>key)
			{
				high=mid-1;
			}
			else if(arr[mid]<key)
			{
				low=mid+1;
			}
		}
		System.out.println("Element not found");
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
		Arrays.sort(arr);
		System.out.println("Enter element to search:");
		int key=sc.nextInt();
		searchElement(arr,key);
	
		
	}
}
