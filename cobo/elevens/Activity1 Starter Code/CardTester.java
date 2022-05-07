/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test0 = new Card("Ace", "Spade", 14);
		Card test1 = new Card("Three", "Diamonds", 3);
		Card test2 = new Card("Ten", "Hearts", 10);
		Card test3 = new Card("Ten", "Hearts", 10);

		System.out.println(test0.toString());
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		System.out.println(test3.toString());

		System.out.println(test0.matches(test1));
		System.out.println(test1.matches(test2));
		System.out.println(test2.matches(test0));
		System.out.println(test2.matches(test3));

	}
}
