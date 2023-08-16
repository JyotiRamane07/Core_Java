package com.jsp.constructors;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Sia");
		System.out.println("Constructor 1 is called");
		System.out.println("Rollno :" +s1.rollno + " Name :" +s1.name);
		
		Student s2=new Student(2,"Ram",30000);
		System.out.println("Constructor 2 is called");
		System.out.println("Rollno :"+s2.rollno + " Name :" +s2.name+ " Fees :" +s2.fees );
		
		Student s3=new Student(3,"Jojo","Development",40000);
		System.out.println("Constructor 3 is called");
		System.out.println("Rollno :"+s3.rollno + " Name :" +s3.name+ " Course :" +s3.course+" Fees :"+s3.fees );
	}

}
