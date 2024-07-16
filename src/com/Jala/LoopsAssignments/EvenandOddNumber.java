package com.Jala.LoopsAssignments;

import java.util.Scanner;

// 4. Write a program to print the odd and even numbers.
public class EvenandOddNumber {
	
	public void evenNumber (int a) {
		System.out.println("this is even number  " ) ;
		for (int i = 1; i <= a ; i++)
		if (i % 2 == 0) {
			System.out.print(i + " ") ;
		}
	}
	public void oddNumber (int a) {
		System.out.println("\n this is odd number  " ) ;
		for (int i = 1 ; i <= a ; i++)
		if (i % 2 == 1) {
			System.out.print(i + " ") ;
		}
		
	}
	
	public static void main(String[] args) {
		
		EvenandOddNumber evenandOddNumber = new EvenandOddNumber();
		System.out.println("enter the range : ") ;
		Scanner sc = new Scanner (System.in);
		int range = sc.nextInt();
		evenandOddNumber.evenNumber(range);
		evenandOddNumber.oddNumber(range);
	}

}
