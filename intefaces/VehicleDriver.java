package com.jsp.intefaces;

public class VehicleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b=new Bike();
		System.out.println(b.getNoOfWheels());
		
		Car c= new Car();
		System.out.println(c.getNoOfWheels());
		
		System.out.println(Vehicle.a);//static final variable
		
	    Vehicle.drive(); //static concrete method of vehicle interface
	    
	    System.out.println(b.a);

      }

}
