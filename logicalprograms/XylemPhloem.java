
package com.jsp.logicalprograms;
import java.util.Scanner;
public class XylemPhloem {

	public static void isXylemPhleom(int n){
		int count1=0;
		int count2=0;
		int sum1=0;
		int sum2=0;
		int p=n;
		
		while(p>0)
		{
			p=p/10;
			count1++;
		}
		p=n;
		while(p>0)
		{
			int lastdigit=p%10;
			count2++;
			
			if(count2==1 || count2==count1) {
				sum1=sum1+lastdigit;
			}
			else
			{
				sum2=sum2+lastdigit;
			}
			p=p/10;
		}
		if(sum1==sum2) {
			System.out.println( n+" It is an Xylem");
		}
		else {
			System.out.println( n+" It is an Phloem");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		isXylemPhleom(n);
	}

}
