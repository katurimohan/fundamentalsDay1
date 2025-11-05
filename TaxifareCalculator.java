package com.codegnan.fundamentals;

import java.util.*;

public class TaxifareCalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Kilometers : ");
		double kms=scanner.nextDouble();
		//first 2kms 50 and next 8kms are 8*15
		double Fare=(kms<=2)?50:
			//first 2=50+nexxt 8*15 +above 10*10
			           (kms<=10)?(50+(kms-2)*15):
			        	  (50+(8*15)+(kms-10)*10);
 		Fare=(kms>20)?Fare*0.95:Fare;
		System.out.println("Total Fare : "+Fare);
	scanner.close();
     
	}

}
