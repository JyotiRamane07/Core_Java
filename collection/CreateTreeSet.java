package com.jsp.collection;
import java.util.TreeSet;
public class CreateTreeSet {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(10);
	ts.add(34);
	ts.add(54);
	ts.add(60);
	ts.add(10); //doesn't allow duplicate values
	System.out.println(ts);
}
}
