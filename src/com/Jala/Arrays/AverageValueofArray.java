package com.Jala.Arrays;

//Write a function to calculate the average value of an array of integers
public class AverageValueofArray {
	public void averageValue() {
		int arr[] = { 2, 3, 6, 8 };
		int add = 0;
		float avg = 0f;
		for (int i = 0; i < arr.length; i++) {
			add = add + arr[i];

		}
		System.out.println("addition of array elements : " + add);
		avg = add / arr.length;
		System.out.println("average value of given array : " + avg);
	}

	public static void main(String[] args) {
		AverageValueofArray averageValueofArray = new AverageValueofArray();
		averageValueofArray.averageValue();
	}

}
