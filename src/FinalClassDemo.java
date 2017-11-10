import java.util.Scanner; // Importing Scanner Class

final class FinalClass{  // A 'final' Class cannot be extended but can be instantiated
	 
	// 'final' variables
	final double PI = 3.14159; // Initialised final variable
	final int  FINAL_NUMBER; // Uninitialised final variable or Blank final variable
		   
	
	// A constructor cannot have 'final' access specifier
	// Use of 'final variable' in constructor. 
	FinalClass(int someNumber)
	{
		FINAL_NUMBER= someNumber; // Uninitialised final variables must be initialised only in constructors
		System.out.println("Initialized the final variable. Value is: " +  FINAL_NUMBER);
	}
		   
	// Final Method
	final void finalMethod()
	{
		System.out.println("\nFinal Method Called");
		System.out.println("Final method cannot be overridden");
		      
	}  
}  
			     

public class FinalClassDemo {
	
 public static void main(String[] args){
	 
	 
	 System.out.println("This program demonstrates the use of final keyword\n");

	 System.out.println("Please input a number to be initialise the final variable: ");
	 
	 // Taking a number as input from the user which will be used to instantiate FinalClass object 
	 Scanner scan = new Scanner(System.in);
	 int someNumber = scan.nextInt();
	 
	 // Using the constructor of FINAL CLASS to initialise it uninitialised final variable
	 FinalClass obj1 = new FinalClass(someNumber);
	 
	 System.out.println("\nPrinting value of PI: " +  obj1.PI);
	 
	 System.out.println("\nCalling Final Method");
	 
	 obj1.finalMethod();
		
	}
}
