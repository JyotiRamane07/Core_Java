package com.jsp.constructors;

public class Calculator {
	// static void type
	public static void addTwoNumbers(int num1,int num2)
	{
		int res=num1+num2;
		System.out.println(res);
	}
	//static and return type
	public static int subTwoNumbers(int num1, int num2)
	{
		int res=num1-num2;
		return res;
	}
	// non-static void
	public void divideTwoNumbers(int a, int b)
	{
		System.out.println(a/b);
	}
	// non-static and return type
	public int mulTwoNumbers(int num1,int num2)
	{
		return num1*num2;
	}
}
