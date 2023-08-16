package com.jsp.logicalprograms;
import java.util.Scanner;
public class NaturalNoSum {
   public int naturalNoSum(int n) {
	   int sum=0;
	   for(int i=1;i<=n;i++)
	   {
		   sum=sum+i;
	   }
	   return sum;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int n=sc.nextInt();
		NaturalNoSum n1=new NaturalNoSum();
		System.out.println("Sum of Natural nuber is " +n1.naturalNoSum(n));

	}

}
