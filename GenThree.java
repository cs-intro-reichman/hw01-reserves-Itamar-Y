/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int var1 = Integer.parseInt(args[0]);
		int var2 = Integer.parseInt(args[1]);

		int gen1 = (var1 + ((int) (Math.random() * (var2-var1))));
		int gen2 = (var1 + ((int) (Math.random() * (var2-var1))));
		int gen3 = (var1 + ((int) (Math.random() * (var2-var1))));


		System.out.println(gen1);
		System.out.println(gen2);
		System.out.println(gen3);
		System.out.println("the minimal generated number is " + Math.min((Math.min(gen1, gen2)), gen3));
	}
}
