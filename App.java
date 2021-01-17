/*
 * Backend Boot Camp Week 5 Assignment 
 * Wendy Sun 
 */
public class App {
	static AsteriskLogger testAstriskLogger; 
	static SpacedLogger testSpacedLogger; 
	
	//9.	Create a class named App that has a main method.
	public static void main(String[] args) {
		//10.	In this class instantiate an instance of each of your logger classes that implement the Logger interface.
		
		Logger testAstriskLogger = new AsteriskLogger(); 
		Logger testSpacedLogger = new SpacedLogger(); 
		
		//11.	Test both methods on both instances, passing in Strings of your choice.
		testAstriskLogger.log("Hello");
		testAstriskLogger.error("Hello");
		
		System.out.println("--------------------------------------------------------");
		
		testSpacedLogger.log("Hello");
		testSpacedLogger.error("Hello");
		
		
		
		

	}//end main

}//end App
