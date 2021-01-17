/*
 * Backend Boot Camp Week 5 Assignment 
 * Wendy Sun 
 */

//2.	a. Add void method, AsteriskLogger,  to the Logger interface, each should take a String as an argument
public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		/*
		 * 4.	The log method on the AsteriskLogger should print out the String it receives between 3 asterisks 
		 * on either side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console.
		 * 
		 */
		System.out.println("***" + log + "***"); 	
		
	}//end log

	@Override
	public void error(String error) {
		/*
		 * 5.	The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, 
		 * with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:

		 ****************
		 ***Error: Hello***
		 ****************

		 */
		System.out.println("ERROR:");
		System.out.println("****************");
		System.out.println(error);
		System.out.println("****************");
		
	}//end error
	
}//end AsteriskLogger
