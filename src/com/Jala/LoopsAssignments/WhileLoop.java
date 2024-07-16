package com.Jala.LoopsAssignments;

// 2. Write a java program to print 1 to 20 numbers using the while loop.
public class WhileLoop {

	public void printNumbersusingWhileLoop() {
		int i = 1;
		while (i <= 20) {
			System.out.println(i);
			i++;

		}
	}

	public static void main(String[] args) {
		WhileLoop whileLoop = new WhileLoop();
		whileLoop.printNumbersusingWhileLoop();
	}

}
