package com.jsp.inheritance;

public class FatherSonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f=new Father();
		f.eat();
		 Father f1=new Son();//upcasting
		 Son s=(Son) f1;//downcasting
		s.eat(); //calling eat method using object reference of Son
		s.drink(); // calls drink method present in Son
	

	}

}
