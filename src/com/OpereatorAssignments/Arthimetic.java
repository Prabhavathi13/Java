package com.OpereatorAssignments;
//1. Write a function for arithmetic operators(+,-,*,/).
public class Arthimetic {
	// additional operator
	 static void addition (int a, int b) {
	        int add = a + b;
	        System.out.println("Addition of a and b is : a + b = " + add);
	    }
	 // substaraction operator
	 static void substraction (int a, int b) {
		 int sub = a - b ;
		 System.out.println("Substraction of  a and b : a - b = " + sub);
	 }
	 // multiplication operator
	 static void multiplication (int a, int b) {
		 int mul = a * b ;
		 System.out.println("multiplication of and b is : a * b = " + mul);
	 }
	 //division operator
	 static void division (int a, int b) {
		 int div = a * b ;
		 System.out.println("division of and b is : a * b = " + div);
	 }


	public static void main(String[] args) {
		int a = 4 ;
		int b = 8 ;
		
		addition (a, b) ;
		substraction (a, b) ;
		multiplication (a, b) ;
		division (a, b) ;		

	}

}
