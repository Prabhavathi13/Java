package com.Jala.LoopsAssignments;

// 13. Program for multiple if else statement(Largest number in 10,20 and 30)
public class MultipleIfelsetofindLargest {
	int num1 = 50;
	int num2 = 20;
	int num3 = 30;

	public void multipleIfelse() {
		if ((num1 > num2) && (num1 > num3)) {

			System.out.println("num1 is the largest number : " + num1);
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println("num2 is the largest number : " + num2);
		} else {
			System.out.println("num3 is the largest number : " + num3);
		}
	}

	public static void main(String[] args) {
		MultipleIfelsetofindLargest ifelsetofindLargest = new MultipleIfelsetofindLargest();
		ifelsetofindLargest.multipleIfelse();
	}

}
