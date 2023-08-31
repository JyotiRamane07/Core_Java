package com.jsp.ObjectClassMethods;

public class CarDriver {
public static void main(String[] args) {
	Car c=new Car("BMW","X1",7418454,"Black");
	System.out.println(c);
	Car c2=new Car("BMW","X1",7418454,"Black");
	System.out.println(c.equals(c2));
	
	Car c3=new Car("BMW","X2",7418454,"Black");
	System.out.println(c.equals(c3));
	System.out.println("===============");
	System.out.println(c.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c3.hashCode());
}
}
