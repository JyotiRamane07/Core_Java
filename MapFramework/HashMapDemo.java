package com.jsp.MapFramework;
import java.util.HashMap;

public class HashMapDemo {

		public static void main(String[] args) {
			HashMap<Integer,String> hm=new HashMap<>();
			hm.put(1,"MSD");
			hm.put(2,"Virat");
			hm.put(6,"Sachin");
			hm.put(4,"Siraj");
			hm.put(5,"Umesh");
			hm.put(1,"Sachin");
			//insertion order is not maintained ,sort the entries in ascending order
			System.out.println("Entries in Hash Map: "+hm);
		}

	}

