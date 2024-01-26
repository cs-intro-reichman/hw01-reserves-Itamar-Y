/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {

		// arguments for range
		int var1 = Integer.parseInt(args[0]);
		int var2 = Integer.parseInt(args[1]);

		//random number generator withing range
		int gen1 = var1 + (int) (Math.random() * (var2-var1));
		int gen2 = var1 + (int) (Math.random() * (var2-var1));
		int gen3 = var1 + (int) (Math.random() * (var2-var1));

		// print of the gen numbers
		System.out.println(gen1);
		System.out.println(gen2);
		System.out.println(gen3);

		int Min = (int) Math.min((Math.min(gen1, gen2)), gen3);

		System.out.println("The minimal generated number was " + Min);
	}
}
