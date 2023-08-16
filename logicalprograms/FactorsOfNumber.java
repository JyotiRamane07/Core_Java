package com.jsp.logicalprograms;
import java.util.Scanner;
public class FactorsOfNumber {
	public void factorsOfNO(int n)
	{   
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Factors of "+n+" are :");
		FactorsOfNumber f1=new FactorsOfNumber();
		f1.factorsOfNO(n);
	}

}
