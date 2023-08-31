package com.jsp.MapFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(1,"MSD");
		lhm.put(2,"Virat");
		lhm.put(6,"Sachin");
		lhm.put(4,"Siraj");
		lhm.put(5,"Umesh");
		lhm.put(1,"Sachin");
		//insertion order is maintained
		System.out.println("Entries in LinkedHashMap: "+lhm); 
	}
}
