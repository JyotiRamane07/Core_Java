package com.jsp.decisionmakingstmt;

public class Larger {

	public static void main(String[] args) {
		int a=20;
		int b=120;
		int c=150;
		int d=200;
		
		if(a>b && a>c && a>d)
		{
			System.out.println(a+ " is greatest");
		}
		else
			if(b>c && b>d)
			{
				System.out.println(b+ " is greatest");
			}
			else
				if(c>d)
				{
					System.out.println(c+ " is greatest");
				}
				else
				{
					System.out.println(d+ " is greatest");
				}
	}

}
