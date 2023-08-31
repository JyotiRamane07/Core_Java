package com.jsp.polymorphism;

public class FatherDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f=new Father();
		f.eat();//calls eat method of father
		Father f1=new Son();
		f1.eat();//calls son eat method
		Son s=new Son();
		s.eat();//calls eat method of son
	}

}
