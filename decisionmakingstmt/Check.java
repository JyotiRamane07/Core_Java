package com.jsp.decisionmakingstmt;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='&';
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			System.out.println(ch+ " It is a alphabet");
		}
		else
			if(ch<='0' && ch>='9')
			{
				System.out.println(ch+ " It is a number");
			}
			else
			{
				System.out.println(ch+ " It is a special character");
			}

	}

}
