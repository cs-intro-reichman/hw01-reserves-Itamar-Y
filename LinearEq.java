/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {

		double var1 = Double.parseDouble(args[0]);
		double var2 = Double.parseDouble(args[1]);
		double var3 = Double.parseDouble(args[2]);

			double x = (var3-var2) / var1;

	System.out.println(var1 + " * x + " + var2 + " = " + var3);
	System.out.println("x = " + x);

	}

}