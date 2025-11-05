package com.codegnan.fundamentals;

import java.util.*;

public class ParkingFeecalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no.of hours the vahicle parked(24 hr) : ");
		double Hours = scanner.nextDouble();
		double Total = (Hours <= 3) ? (Hours * 2) : (3 * 2 + (Hours - 3) * 1);
		System.out.println("Total : " + Total);
		scanner.close();

	}

}
