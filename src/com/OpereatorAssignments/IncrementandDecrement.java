package com.OpereatorAssignments;
//2. Write a method for increment and decrement operators(++, --)
public class IncrementandDecrement {
    /* Increment Operator :	++	(++a or a++)
    It increments the value of a variable by 1.	*/
    static void preIncrementofa(int a, int b) {
        int d;                  //First the value of a is incremented to 3 //the value 1 is added before the given operation completed
        d = b + (++a);          //Then b is added to 3 to get 7
        System.out.println("Values after Pre-Increment a, b : " + a + ", " + d);//a=3,b=4
    }
    
    static void postIncrementofa(int a, int b) {
    	int d ;
    	d = b + (a++);   // the value 1 is added after the operation completed 
    	System.out.println("Values after Post-Increment a, b : " + a + ", " + d);//a=2,b=4
    	
    }
    
    static void preDecrementofa(int a, int b) {
    	int d ;
    	d = b + (--a);
    	System.out.println("Values after Post-Increment a, b : " + a + ", " + d);//a=1,b=4
    	
    }
    
    static void postDecrementofa(int a, int b) {
    	int d ;
    	d = b + (a--);
    	System.out.println("Values after Post-Increment a, b : " + a + ", " + d);//a=2,b=4
    	
    }

    static void preIncrementofb(int a, int b) {
        int d;                  //First the value of a is incremented to 3
        d = a + (++b);          //Then b is added to 3 to get 7
        System.out.println("Values after Pre-Increment a, b : " + a + ", " + d);//a=2,b=5
    }
    
    static void postIncrementofb(int a, int b) {
    	int d ;
    	d = a + (b++);
    	System.out.println("Values after Post-Increment a, b : " + a + ", " + d);//a=2,b=4
    	
    }
    
    static void preDecrementofb(int a, int b) {
    	int d ;
    	d = a + (--b);
    	System.out.println("Values after Post-Increment a, b : " + a + ", " + d);//a=2,b=3
    	
    }
    
    static void postDecrementofb(int a, int b) {
    	int d ;
    	d = a + (b--);
    	System.out.println("Values after Post-Increment a, b : " + a + ", " + d);//a=2,b=4
    	
    }

    
    public static void main(String[] args) {
	
		int a = 2 ;
		int b = 4 ;
		
		preIncrementofa(a, b) ;
		postIncrementofa(a, b) ;
		preDecrementofa(a, b) ;
		postDecrementofa(a, b) ;

		preIncrementofb(a, b) ;
		postIncrementofb(a, b) ;
		preDecrementofb(a, b) ;
		postDecrementofb(a, b) ;
	}

}
