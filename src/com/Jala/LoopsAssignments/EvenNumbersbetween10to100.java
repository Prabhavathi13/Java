package com.Jala.LoopsAssignments;

// 6. Write a program to print even number between 10 and 100 using while
public class EvenNumbersbetween10to100 {
	public void whileloop() {
		int i = 10;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;

		}
	}

	public static void main(String[] args) {
		System.out.println("Even numbers between 10 to 100 ");
		EvenNumbersbetween10to100 evenNumbersbetween10to100 = new EvenNumbersbetween10to100();
		evenNumbersbetween10to100.whileloop();

	}

}
