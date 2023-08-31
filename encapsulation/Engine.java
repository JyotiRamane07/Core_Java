package com.jsp.encapsulation;

public class Engine {
private String horse_power;
private double cubic_capacity;

//constructor of Engine
public Engine(String horse_power, double cubic_capacity) {
	this.horse_power = horse_power;
	this.cubic_capacity = cubic_capacity;
}

//setters and 
public void setHorse_power(String horse_power) {
	this.horse_power = horse_power;
}

public String getHorse_power() {
	return horse_power;
}

public void setCubic_capacity(double cubic_capacity) {
	this.cubic_capacity = cubic_capacity;
}

public double getCubic_capacity() {
	return cubic_capacity;
}
public void printEngineDetails()
{
	System.out.println("Engine Config...");
	System.out.println(horse_power+" is the horse_power");
	System.out.println(cubic_capacity+" is the cubic capacity");
}
}
