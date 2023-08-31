package com.jsp.ObjectClassMethods;

public class Employee {

int id;
String name;
String email;
public Employee(int id, String name, String email) {
	
	this.id = id;
	this.name = name;
	this.email = email;
}
@Override
public String toString()
{
	return "[" + id + " is Empid. "+name+" is Empname. " +email+ " is Empemail." +"]";
}

}
