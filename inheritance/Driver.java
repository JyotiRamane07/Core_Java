package com.jsp.inheritance;

public class Driver {

	public static void main(String[] args) {
	//Case:1 (Members of Object + members of A + Members of B)
	A a=new B();
	B b=(B) a;
	System.out.println(b.x);
	System.out.println(b.y);
	
	//Case:2 (Members Of Object + A)
	A a2=new A();
	B b2=(B) a2; 
	System.out.println(b2.x); //ClassCastException Occurs
	
	// Case:3 (Members of Object + A + B)
	A a3=new B();
	C c=(C) a3;
	System.out.println(c.c);//ClassCastException Occurs
	}

}

