package com.Jala.LoopsAssignments;

public class ForLoopexample {
	int num = 10 ;
	int num2 = 20 ;
	public void printNumbers () {
		for (int i = 0 ; i <= num ; i++) {
			for (int j = 10 ; j <= num2 ; j++)
			System.out.println(i + "  " + j);
		}
	}
	public static void main(String[] args) {
		ForLoopexample forLoopExample = new ForLoopexample();
		forLoopExample.printNumbers ();
	}
	

}
