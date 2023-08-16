package com.jsp.logicalprograms;
import java.util.Scanner;
public class Factorial {

	   public int factorialOfNumber(int n) {
		   int pro=1;
		   for(int i=1;i<=n;i++)
		   {
			   pro=pro*i;
		   }
		   return pro;
	   }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		   
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter A number");
			int n=sc.nextInt();
			Factorial f1=new Factorial();
			System.out.println("Factorial of a number is " +f1.factorialOfNumber(n));

		}

	}


