package com.Jala.Arrays;

import java.util.Scanner;

// 3. Write a program to find the index of an array element
public class IndexofanArray {
	public void findtheindexofArray(int num , int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.println(num + " is at index : " + i);
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 3, 5, 8, 30 };
		System.out.println("this is the array");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\nselect the value to find out it's index : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		IndexofanArray array = new IndexofanArray();
		array.findtheindexofArray(num , arr);

	}

}
