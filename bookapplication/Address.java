package com.jsp.bookapplication;

public class Address {
	private String street_name;

	private String state;
	private String city;
	
	public Address(String street_name,String state,String city)
	{
		this.street_name=street_name;
		this.state=state;
		this.city=city;
	}
	public void setSteet_name(String street_name)
	{
		this.street_name=street_name;
	}
	public String getStreet_name() {
		return street_name;
	}

	public void setState(String state)
	{
		this.state=state;
	}
	public String getcity() {
		return state;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	
	public void printAddressDetails()
	{
		System.out.println("---Author Address----");
		System.out.println("Street_name : "+street_name);
	
		System.out.println("State : "+state);
		System.out.println("City : "+city);
		
	}

}
