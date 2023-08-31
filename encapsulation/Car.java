package com.jsp.encapsulation;

public class Car {
	
	private String name;
	private String brand;
	private String color;
	private double price;
	
	//achieves has a relationship with Engine
	private Engine engine;
	
	//constructor of Car
	public Car(String name,
			
			
			
		String brand, String color, double price) {
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}
	public void printCarDetails()
	{
		System.out.println("Car Config...");
		System.out.println(name+" is the Car");
		System.out.println(brand+" is the brand");
		System.out.println(color+" is the color");
		System.out.println(price+"is the cost");
		if(engine!=null)
		{
			engine.printEngineDetails();
		}
		else
		{
			System.out.println("Engine is not present");
		}
	}
}