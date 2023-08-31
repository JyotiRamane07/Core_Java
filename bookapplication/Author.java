package com.jsp.bookapplication;

public class Author {
	private String name;
	private String email;
	private long contact_no;
	
	private Address address;
	
	public Author(String name,String email,long contact_no)
	{
		this.name=name;
		this.email=email;
		this.contact_no=contact_no;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
		
	}
	public String getEmail() {
		return email;
	}
	public void set(long contact_no)
	{
		this.contact_no=contact_no;
		
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setAddress(Address address)
	{
		this.address=address;
		
	}
	public Address getAddress() {
		return address;
		
	}
	
	public void printAuthorDetails()
	{
		System.out.println("---Author Details---");
		System.out.println("Author name : "+name);
		System.out.println("Author email : "+email);
		System.out.println("Conatct_no : "+contact_no);
		if(address!=null)
		{
			address.printAddressDetails();
		}
		else
		{
			System.out.println("Address details are not present");
		}
		
	}
	
}
