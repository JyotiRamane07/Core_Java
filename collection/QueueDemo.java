package com.jsp.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;
public class QueueDemo {
	public static void main(String[] args) {
		Queue queue=new LinkedList<>(); // Queue is a interface and LinkedList is a child class of Queue interface
		//adding elements in queue 
		queue.add("Book1");
		queue.add("Book2");
		queue.add("Book3");
		queue.add("Book4");
		queue.add("Book5"); 
		System.out.println("Elements in Queue: "+queue);
		
		
		System.out.println("Element to be removed is :"+queue.remove()); 
		
		System.out.println("After removing first element from queue :"+queue);
		
		
	}
}
