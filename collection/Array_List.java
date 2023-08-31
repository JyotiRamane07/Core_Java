package com.jsp.collection;
import java.util.*;
public class Array_List {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(123);
		al.add(345);
		al.add(123);
		al.add(789);
		System.out.println(al);
		System.out.println(al.contains(789));
		System.out.println(al.contains(34));
		
		
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		al2.add(11);
		al2.add(12);
		System.out.println(al2);
			
		System.out.println(al2.contains(123));
		System.out.println(al2.containsAll(al));
		al2.remove(4); // it will remove the element present at specified index
		System.out.println(al2);
		
		
		//al2.clear(); //it will make al2 empty, clear all objects 
		//System.out.println(al2);
		al2.retainAll(al);
		System.out.println(al2);
	}

}
