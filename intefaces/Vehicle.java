package com.jsp.intefaces;

public interface Vehicle {
int a=10;//by defaulth it is public static final
public int getNoOfWheels(); //non-static method , by default it is abstarct in nature
 public static void drive()//static concrete method of vehicle interface
 {
	 System.out.println("Static method from vehicle interface");
 }
}
