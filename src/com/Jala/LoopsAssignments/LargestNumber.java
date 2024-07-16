package com.Jala.LoopsAssignments;

import java.util.Scanner;

// 5. Write a program to print largest number among three numbers.
public class LargestNumber {
   
    public void findLargestNumber(int i, int j, int k) {
    	if ( (i > j ) && (i > k)) {
    		System.out.println("this number is largest number : " + i);
    	}else if ((j > i) && (j > k)) {
    		System.out.println("this number is largest number : " + j);
    	} else {
    		System.out.println("this number is largest number : " + k);
    	}
    }
    public static void main(String[] args) {
		LargestNumber largestNumber = new LargestNumber();
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter three numbers to find largest number among them ");
		System.out.println("Enter first number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number : ");
		int num2 = scan.nextInt();
		System.out.println("Enter third number : ");
		int num3 = scan.nextInt();
		largestNumber.findLargestNumber(num1, num2, num3);
	} 
}
