package com.Jala.LoopsAssignments;

//7. Write a program to print 1 to 10 using the do-while loop statement.
public class PrintingNumbersDowhile {
	public void doWhileloop() {
		int a = 1;
		do {
			System.out.println(a);
			a++;
		} while (a <= 20);

	}

	public static void main(String[] args) {
		System.out.println("Printing Numbers Using DoWhile : ");
		PrintingNumbersDowhile printingNumbersDowhile = new PrintingNumbersDowhile();
		printingNumbersDowhile.doWhileloop();

	}

}
