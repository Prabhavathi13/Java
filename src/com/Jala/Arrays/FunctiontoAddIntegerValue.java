package com.Jala.Arrays;

// 1. Write a function to add integer values of an array
public class FunctiontoAddIntegerValue {
	public void additionofArray() {
		int arr[] = { 4, 8, 9, 2, 10 };
		int add = 0;
		for (int i = 0; i < arr.length; i++) {
			add = add + arr[i];
		}
		System.out.println(" addition of given array elements : " + add);

	}

	public static void main(String[] args) {
		FunctiontoAddIntegerValue functiontoAddIntrgervalue = new FunctiontoAddIntegerValue();
		functiontoAddIntrgervalue.additionofArray();
	}

}
