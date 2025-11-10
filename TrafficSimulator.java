package com.codegnan.fundamentals;

import java.util.*;

public class TrafficSimulator {   

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Light state(Green,Yellow,Red)");
		String lightstate=scanner.next();
		System.out.println("Enter Hour(0-23)");
		int hour =scanner.nextInt();
		boolean isDaytime=(hour>=6 && hour <= 18);
		String action;
		if(lightstate.equalsIgnoreCase("Green")) {
			action="Go";
			
		}else {
			if(lightstate.equalsIgnoreCase("yellow")) {
				action="Slow";
			}else {
				if(lightstate.equalsIgnoreCase("red")) {
					action="Stop!";
				}else {
					if(lightstate.equalsIgnoreCase("yellow")) {
						if(isDaytime) {
							action="Slow";
						} else {
							action="Stop!";							
						}
						}else {
							action="Invalid Light State";
					
					}
				}
			}
		}
		System.out.println(action);
scanner.close();
	}

}
