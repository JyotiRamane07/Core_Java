package com.jsp.MapFramework;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1,"MSD");
		tm.put(2,"Virat");
		tm.put(6,"Sachin");
		tm.put(4,"Siraj");
		tm.put(5,"Umesh");
		tm.put(1,"Sachin");
		//insertion order is not maintained
		System.out.println("Entries in TreeMap: "+tm); 
	
}
}