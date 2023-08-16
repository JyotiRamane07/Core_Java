package com.jsp.decisioncontrolstmt;

public class EvenNumbers {

	public static void main(String[] args) {
		int i=1;
		System.out.println("Even numbers from 1 to 100 are: ");
		System.out.println("Using while loop: ");
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
			}
		i++;
			
		}
		
		
    System.out.println(" ");	
	System.out.println("Using do-while loop ");
	// using do while loop
		i=1;
		do{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		   i++;
		  }while(i<=100);
		
		
	System.out.println("\nUsing for loop ");
	// using for loop
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
			}
		}

	}

}
