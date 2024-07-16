package com.Jala.LoopsAssignments;

// 1. Write a program to print “Bright IT Career” ten times using for loop
public class BrightITCareer {
	int loop = 10;

	public void printingString() {
		for (int i = 1; i <= loop; i++)
			System.out.println(i + " : " + "Bright IT Career");
	}

	public static void main(String[] args) {
		BrightITCareer brightITCareer = new BrightITCareer();
		brightITCareer.printingString();
	}

}
