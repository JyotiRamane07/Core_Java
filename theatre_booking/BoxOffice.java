package com.jsp.theatre_booking;
import java.util.Scanner;
public class BoxOffice {

		public static void main(String[] args) {
			Theatre theatre=new Theatre("INOX",500);
			Scanner sc =new Scanner(System.in);
			//create ticket object
			
			/*theatre.setTicket(new Ticket("IB71",50));
			theatre.bookTicket();
			theatre.showTicketDetails();
			theatre.cancelTicket(25);
			theatre.checkAvailability();
			theatre.showTicketDetails(); */
			
		
			//By using Switch case and Scanner class
		boolean flag=true;
		while(flag)
		{
			System.out.println("Enter : \n 1. Availability status \n 2. Book your ticket \n 3. Show booking details \n 4. Cancel ticket \n 5. Exit");
		
			
			int choice=sc.nextInt();
			
				switch(choice)
				{
					case 1:
					{
						theatre.checkAvailability();
					}break;
					case 2:
					{
						System.out.println("Enter  movie name");
						String movie=sc.next();
						System.out.println("Enter Number of seats you want to book");
						int n=sc.nextInt();
							theatre.setTicket(new Ticket(movie,n));
							theatre.bookTicket();
					}break;
					case 3:
					{
						theatre.showTicketDetails();
					}break;
					case 4:
					{
						System.out.println("Enter number of tickets you want cancel");
						int n=sc.nextInt();
						theatre.cancelTicket(n);
					
					}break;
					case 5:
					{
						System.out.println("Thank You");
						flag=false;
					}break;
					default:
					{
						System.out.println("Wrong Input");
					}
				
			}
			
		}
			
			
		}		
}
