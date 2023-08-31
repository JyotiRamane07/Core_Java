package com.jsp.ObjectClassMethods;

import java.util.Objects;

public class Car {

String brand;
String name;
double price;
String color;

public Car(String brand, String name, double price, String color) {
	super();
	this.brand = brand;
	this.name = name;
	this.price = price;
	this.color = color;
}
@Override
public String toString()
{
	return "[ " +brand+ " ,"+name+" ,"+price+" ,"+color+ " ]";
}
@Override
public boolean equals(Object obj)
{
	Car c=(Car) obj; //downcasting
	
	if(this.brand==c.brand && this.name==c.name && this.price==c.price && this.color==c.color)
	{
		return true;
	}
	else
	{
		return false;
	}
}
@Override
public int hashCode()
{
	return Objects.hash(brand,name,price,color);
}
}
