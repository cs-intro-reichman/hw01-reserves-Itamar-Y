/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {

		int var1 = Integer.parseInt(args[0]);
		int var2 = Integer.parseInt(args[1]);
		int var3 = Integer.parseInt(args[2]);

			int x = (var3-var2) / var1;

	System.out.println(var1 + " * x + " + var2 + " = " + var3);
	System.out.println("x = " + x);

	}

}