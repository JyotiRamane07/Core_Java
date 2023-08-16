package com.jsp.decisioncontrolstmt;

public class Natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		System.out.println("Using while loop ");
		while(i<=100) {
			System.out.print(i+ " ");
			i++;
		}
		System.out.println(" ");
		System.out.println("Using do-while loop ");
		i=1;
		 do{
				System.out.print(i+" ");
				i++;
		 }while(i<=100);
		 System.out.println(" ");
		 System.out.println("Using for loop ");
		 for(i=1;i<=100;i++)
		 {
			 System.out.print(i+" ");
		 }

	}

}
