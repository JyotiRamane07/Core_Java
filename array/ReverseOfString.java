package com.jsp.array;

import java.util.Scanner;

public class ReverseOfString {

		public static void reverseOfString(String arr[])
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

			String arr[] = new String[size];

			System.out.println("Enter array elements:");
			for (int i = 0; i <arr.length; i++) {

				arr[i] = sc.nextLine();
			}
			System.out.println("Reverse of array elements : ");
			
			reverseOfString(arr);
		}
}
