/*5. Define the local and Global variables with the same name and print both variables and
understand the scope of the variables*/

package com.practice_1;

public class LocalglobalVariable {
	 int a = 8;   // gloabal or instance variable which works under the  whole class 
	    void localVariable() {
	        //Local variables are declared in methods, constructors, or blocks.
	        int a = 12;   // local variable which works only under in method.
	        System.out.println("Local variable a : " + a);
	    }


	public static void main(String[] args) {
		
		LocalglobalVariable obj = new LocalglobalVariable();
        System.out.println("Instance variable a : " + obj.a);
        //calling method()
        obj.localVariable();
		

	}

}
