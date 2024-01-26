/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	/**
	 */
	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int Result = number1 + number2;


		System.out.println("The sum of " + number1 + " and " + number2 + " is " + Result);
	}
}


