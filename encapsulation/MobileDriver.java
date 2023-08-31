package com.jsp.encapsulation;

public class MobileDriver {
public static void main(String[] args) {
	Mobile m=new Mobile("Fusion30","Moto",4000,"12gb");
	m.setSim1(new Sim1("Airtel",7420005960l));
	m.setSim2(new Sim2("Jio",9970100803l));
	m.printMobileDetails();
}
}
