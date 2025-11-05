package com.codegnan.fundamentals;

import java.util.Scanner;

public class Studentgradecalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter marks : ");
		int Marks=scanner.nextInt();
		char grade=(Marks>=90)?'A':
			                (Marks>=80 && Marks<=89)?'B':
			                	(Marks>=70 && Marks<=79)?'C':
			                		(Marks>=60 && Marks<=69)?'d':
			                			(Marks>=50 && Marks<=59)?'E':
			                				'F';
		System.out.println("Grade : " +grade);
		scanner.close();

	}

}
