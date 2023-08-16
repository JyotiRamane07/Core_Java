package com.jsp.logicalprograms;
import java.util.Scanner;
public class DigitCount {
	public  static int digitCount(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Number of digits present in a number is:"+digitCount(n));
	}

}
