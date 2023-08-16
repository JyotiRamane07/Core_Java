package com.jsp.logicalprograms;

import java.util.Scanner;

public class PalindromeNumber {

		public static void isPalindrome(int n)
		{	int tmp=n;
			int rev=0;
			while(n>0)
			{
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;
			}
			if(tmp==rev)
			{
				System.out.println(tmp + " is palindrome number ");
			}
			else
			{
				System.out.println(tmp + " is not palindrome number ");
			}
			
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number to reverse:");
				int n=sc.nextInt();
			    isPalindrome(n);
			
		}

	

}
