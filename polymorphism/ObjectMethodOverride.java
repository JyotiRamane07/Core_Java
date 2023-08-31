package com.jsp.polymorphism;

public class ObjectMethodOverride {

	String name;
	int rollno;
	
	public ObjectMethodOverride(String name,int rno)
	{
		this.name=name;
		this.rollno=rno;
		
	}
	public String toString()
	{
		return "["+name+" "+rollno+"]";
	}
	
	public static void main(String arg[])
	{
		ObjectMethodOverride m1=new ObjectMethodOverride("Joy",123);
		System.out.println(m1);
		
	}
}
