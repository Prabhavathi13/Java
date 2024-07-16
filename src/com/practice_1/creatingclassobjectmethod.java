// 1. How to create a class, object, method and its signature.
package com.practice_1;
// creating a class by using keyword "class"
public class creatingclassobjectmethod {

	//creating a method using methodname()
	
	void isMethod() {
        String a = "This is a Method";
        System.out.println(a);
    }

	public static void main(String[] args) {
		creatingclassobjectmethod obj = new creatingclassobjectmethod();
        // Calling the method
        obj.isMethod();
		
		
		
	}
}
     