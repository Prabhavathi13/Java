package com.OpereatorAssignments;
// 4. Write a program to find the two numbers equal or not.

import java.util.Scanner;

public class TwoNumbersEqualorNot {

	public static void main(String[] args) {
	      /* To get the instance of Java Scanner which reads input from the user,
           we need to pass the input stream (System.in) in the constructor of Scanner class. */
		
		 Scanner num = new Scanner(System.in);
	        System.out.print("Enter first number : ");
	        // "nextInt()" scans the next token of the input as an Int.
	        
	        int a = num.nextInt();
	        System.out.print("Enter second number : ");
	        
	        int b = num.nextInt();
	        //equal operator (==)
	        
	        if (a == b) {
	            System.out.println("Both  numbers are equal and values of a and b is : " + a + " , " + b);
	        }
	        //not equal operator (!=)
	        else if (a != b) {
	            System.out.println("Both numbers are not equal and values of a and b is : " + a + " , " + b);
	        }

	}

}
