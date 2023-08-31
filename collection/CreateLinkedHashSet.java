package com.jsp.collection;

import java.util.LinkedHashSet;

public class CreateLinkedHashSet{
	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("MSD");
		lh.add("Virat");
		lh.add("Rahane");
		lh.add("Sachin");
		lh.add("Virat");	
		System.out.println("Elements In LinkedHashSet: "+lh);
}
}
