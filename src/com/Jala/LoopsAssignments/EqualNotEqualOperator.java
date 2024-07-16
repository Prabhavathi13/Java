package com.Jala.LoopsAssignments;

//3. Program to equal operator and not equal operators
public class EqualNotEqualOperator {
	int a = 10;
	int b = 10;

	public void ifcondition() {

		if (a == b) {
			System.out.println(" a is equal to b");
		} 
		else if (a != b) {
			System.out.println("a is not equal to b");
		} else {
			System.out.println("a is  equal to b");
		}
	}

	public static void main(String[] args) {
		EqualNotEqualOperator equalNotEqual = new EqualNotEqualOperator();
		equalNotEqual.ifcondition();
	}
}
