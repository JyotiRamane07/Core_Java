package com.jsp.collection;
import java.util.*;
public class VectorMethods {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(123);
		v1.add(345);
		v1.add(123);
		v1.add(789);
		System.out.println(v1);
		System.out.println(v1.contains(789));
		System.out.println(v1.contains(34));
		
		
		Vector v2=new Vector();
		v2.addAll(v1);
		v2.add(11);
		v2.add(12);
		System.out.println(v2);
			
		System.out.println(v2.contains(123));
		System.out.println(v2.containsAll(v1));
		v2.remove(4); // it will remove the element present at specified index
		System.out.println(v2);
		
		
		//al2.clear(); //it will make v2 empty, clear all objects 
		//System.out.println(v2);
		v2.retainAll(v1);
		System.out.println(v2);
	}
}
