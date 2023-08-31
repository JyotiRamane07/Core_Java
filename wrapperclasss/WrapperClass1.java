package com.jsp.wrapperclasss;
import java.util.ArrayList;
public class WrapperClass1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(87);
		System.out.println(al);

		
		int a=25;
		Integer b=Integer.valueOf(a);//Boxing
		Integer i=a;//Auto Boxing
		System.out.println(i);
		
		int d=i.intValue();//Unboxing
		int c=i; //Auto Unboxing

		System.out.println(b+" Boxing -->from primitive to non primitive");
		System.out.println(i+ " Auto Boxing");
		System.out.println(d+ " unboxing");
		System.out.println(c+ " Auto Boxing");
			
	}

}
