package com.codegnan.fundamentals;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter TotalAmount :");
		double total=scanner.nextDouble();
		if(total>100) {
			total=(total-(total*0.10));
		}
		else {
			total=(total-(total*0.05));
		}
		System.out.println("Total Amount : "+total);
		scanner.close();

	}

}
