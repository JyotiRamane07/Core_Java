package com.jsp.encapsulation;

public class CarDriver {
public static void main(String[] args) {
	Car c=new Car("Eritga","Maruti Suzuki","black",864070);
	c.setEngine(new Engine("101.65bhp@6000rpm",1462));
	c.printCarDetails();
}
}
