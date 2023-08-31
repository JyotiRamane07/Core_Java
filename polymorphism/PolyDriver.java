package com.jsp.polymorphism;

public class PolyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	A a=new A();
	a.m1();
	
	A a1=new B();
	a1.m1();

	A a2=new C();
	a2.m1();
	
	A a3=new D();
	a3.m1();
	}

}
