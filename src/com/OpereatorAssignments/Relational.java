package com.OpereatorAssignments;
//  6. Program for relational operators (<,<==, >, >==)
import java.util.Scanner;
public class Relational {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter first number: ");
		 int a = scan.nextInt();
		 System.out.print("Enter second number: ");
		 int b = scan.nextInt();
		
		   // Less than operator (<)
	        if (a < b) {
	            System.out.println(a + " is less than " + b);
	        }
	        
	        // Less than or equal to operator (<=)
	        if (a <= b) {
	            System.out.println(a + " is less than or equal to " + b);
	        }
	        
	        // Greater than operator (>)
	        if (a > b) {
	            System.out.println(a + " is greater than " + b);
	        }
	        
	        // Greater than or equal to operator (>=)
	        if (a >= b) {
	            System.out.println(a + " is greater than or equal to " + b);
	        }
	        
	        
		 
	 }

}
