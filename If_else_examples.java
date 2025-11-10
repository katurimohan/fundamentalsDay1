package com.codegnan.fundamentals;

import java.util.*;

public class If_else_examples {

	public static void main(String[] args) {
	double	balance=10000;
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter Amount : ");
	double amount=sc.nextDouble();
	if(amount<=balance) {
		balance-=amount;
		System.out.println("Withdrawl Sucessful.");
		System.out.println("Remaining balance is "+balance);
		
	}
	else {
		System.out.println("Insufficent Funds");
	}
	sc.close();

	}

}
