package com.jsp.constructors;

public class Student {
	int rollno;
	String name;
	String course;
	double fees;
	
	public Student(int rno,String nm)
	{
		this.rollno=rno;
		this.name=nm;
		
	}
	public Student(int rno,String nm,double f)
	{
		this.rollno=rno;
		this.name=nm;
		this.fees=f;
	}
	public Student(int rno,String nm,String c, double f)
	{
		this.rollno=rno;
		this.name=nm;
		this.course=c;
		this.fees=f;
		
	}
	
	
	
	
}
