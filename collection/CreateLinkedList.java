package com.jsp.collection;

import java.util.LinkedList;

public class CreateLinkedList {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(24);
		l.add(76);
		l.add(72);
		l.add(97);// adding elements to LinkedList
		System.out.println("Linked List Elements: " +l);
		
		l.add(2,123);
		System.out.println("LInked LIst After adding new ELement: "+l);
	}
}
