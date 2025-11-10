package com.codegnan.fundamentals;

import java.util.*;

public class Ticketpricing {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter passengertype(adult,child,senior) :");
		String passengertype=scanner.next();
		System.out.println("Enter booking time(early,normal,last-minute) :");
		String bookingtime=scanner.next();
		System.out.println("You have Membership(true/false) :");
		boolean member=scanner.nextBoolean();
		
		double baseprice=5000;
		
		//passenger type discount
		if(passengertype.equalsIgnoreCase("child")) {
			baseprice*=0.5;
			
		}else if(passengertype.equalsIgnoreCase("adult")) {
			//no change
		}else if(passengertype.equalsIgnoreCase("senior")) {
			baseprice*=0.9;
		}else {
		    System.out.println("Invaild passegertype!");
		    scanner.close();
		    return;
		}
			
		//booking time discount
		if(bookingtime.equalsIgnoreCase("early")) {
			baseprice*=0.9;
		}else if(bookingtime.equalsIgnoreCase("normal")) {
			//no change
		}else if(bookingtime.equalsIgnoreCase("last-minute")) {
			baseprice*=1.2;
		}else {
			System.out.println("Invalid Bookiing time!");
			scanner.close();
			return;
		}
		//membership discount
		if(member) {
			baseprice*=0.95;
		}
			System.out.println(baseprice);
			scanner.close();
			
			
	}
}