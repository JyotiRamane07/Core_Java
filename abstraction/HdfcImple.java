package com.jso.abstraction;

public class HdfcImple extends HDFC{
	@Override
	public void payment()
	{
	 System.out.println("Implementing Payment Method");
	}
	 public void transfer()
	{
		System.out.println("Implementing Transfer Method");
	}
	public void checkStatement()
	{
		System.out.println("Implementing checkStatemnet Method");
	}
	public static void main(String args[])
	{
		HdfcImple h1=new HdfcImple();
		h1.payment();
		h1.transfer();
		h1.checkStatement();
		h1.m1();                  
	}
}
