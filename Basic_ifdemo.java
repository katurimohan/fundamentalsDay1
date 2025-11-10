package com.codegnan.fundamentals;

import java.util.*;

public class Basic_ifdemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=scanner.nextInt();
		if(num>0) {
			System.out.println("The number is positive :"+num);
		}else
		System.out.println("The number is negative : "+num);
		scanner.close();

	}

}
