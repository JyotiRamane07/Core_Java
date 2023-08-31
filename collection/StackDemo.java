package com.jsp.collection;
import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack <String> books=new Stack<>();
	//pushing elements in stack
	books.push("Book1");
	books.push("Book2");
	books.push("Book3");
	books.push("Book4");
	books.push("Book5"); 
	System.out.println("Elements in Stack: "+books);
	
	
	System.out.println(books.peek()); //to print top element of stack
	
	books.pop();// removes top element from stack
	System.out.println("After removing top element from stack :"+books);
	
	//removing elements from stack
	books.pop();
	books.pop();
	books.pop();
	System.out.println(books);
	
}
}
