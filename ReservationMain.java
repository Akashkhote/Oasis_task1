package oasis;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ReservationMain 
{
	private static String userId = "akash";
	private static String password = "akash123";
	
	private static ReservationBlueprint r1 ;
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Online Train Reservation !");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Username : ");
		String login = sc.nextLine();
		
		System.out.println("Enter your Password : ");
		String pass = sc.nextLine();
		
		
		if(userId.equals(login) && password.equals(pass))
		{
			System.out.println("Login Successfully !");
			System.out.println("*********************************************");
			
			while(true)
			{
				System.out.println("\n1. Book your ticket ");
				System.out.println("2. Cancel your Ticket!");
				System.out.println("3. Logout");
				System.out.println("\nEnter your choice: ");
				int select = sc.nextInt();
				
				System.out.println("");

				
				switch(select)
				{
				case 1:
					makeReservation(sc);
					break;
					
				case 2:
					cancelReservation(sc);
					break;
				
				case 3:
					System.out.println("Logout");
					System.exit(0);
					
								
				default:
					System.out.println("Invalid Entry..");
				}
			}	
		}
		else
		{
			System.out.println("Invalid Credentials!");
		}
		
		
	}
	
	private static void makeReservation( Scanner sc)
	{
		sc.nextLine();
	
		System.out.println("\nEnter your full name:  ");
		String name = sc.nextLine();
		
		System.out.println("Enter your starting station : ");
		String start = sc.nextLine();
		
		System.out.println("Enter your destination station : ");
		String end = sc.nextLine();
		
        System.out.println("Enter a date (DD-MM-YYYY) : ");
        String date = sc.nextLine();
        
        System.out.println("Enter a train name :");
        String trainName = sc.nextLine();
        
        System.out.println("Reservation successful....!");
		System.out.println("*********************************");
	
		int pnrNumber=pnrNumber();
		
		r1 = new ReservationBlueprint(pnrNumber, name, start, end, date, trainName);
		
		System.out.println("\nYour PNR Number is : "+pnrNumber);
		System.out.println("Full Name : "+name);
		System.out.println("Journey : "+start+" to "+end);
		System.out.println("Date : "+date);
		System.out.println("Train Name : "+trainName);
		System.out.println("*****************************************");


	}

	private static void cancelReservation(Scanner sc)
	{
		if(r1!=null)
		{
		System.out.println("Enter your PNR Number : ");
		int enteredNum = sc.nextInt();
		
			if((r1.getPNRNumber())==(enteredNum))
			{
	
		        System.out.println("\nReservation Details : ");
				System.out.println("Your PNR Number is : "+r1.getPNRNumber());
				System.out.println("Full Name : "+r1.getName());
				System.out.println("Journey : "+r1.getStart()+" to "+r1.getEnd());
				System.out.println("Date : "+r1.getDate());
				System.out.println("Train Name : "+r1.getTrainName());
				sc.nextLine();

				System.out.println("Enter 'ok' for Confirm cancellation : ");
				String cancel = sc.nextLine().toLowerCase();
				
				if("ok".equals(cancel))
				{
					System.out.println("Reservation cancelled successfully!");
				}
				else
				{
					System.out.println("Cancellation Unsuccessful.");
				}
				System.out.println("*********************************");

			
			}
			else
			{
				System.out.println("Entered PNR Number is Worng.");
			}
		}
		else
		{
			System.out.println("You don't have any Reservation.");
		}
	}
	
		private static int pnrNumber()
		{
			return ThreadLocalRandom.current().nextInt(100000, 1000000);
		
		}
}
