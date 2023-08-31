package com.jsp.array;

import java.util.Scanner;

public class PrimeNumberArray {

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
			return true;
	}

	public static int primeArray(int arr[]) {
		int primecount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i]) == true) {
				primecount++;
			}
		}
		return primecount;
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
		int count = primeArray(arr);
		System.out.println("Count of Prime number in array: "+count);
	}
}