/*
 * Backend Boot Camp Week 5 Assignment 
 * Wendy Sun 
 */

//2.	b. Add void method, SpacedLogger,  to the Logger interface, each should take a String as an argument
public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		/*
		 * 6.	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
		   7.	If the log method received “Hello” as an argument, it should print H e l l o
		 */
		for (int i=0; i<log.length();i++) {
			System.out.println(log.charAt(i)); 	
			i++;
			System.out.println(" "); 
		}//end for
				
	}//end log

	@Override
	public void error(String error) {
		/*
		 * 8.	The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
		 */
		System.out.println("ERROR:");
		for (int i=0; i<error.length();i++) {
			System.out.println(error.charAt(i)); 	
			i++;
			System.out.println(" "); 
		}//end for
	}//end error	
		
}//end SpacedLogger
