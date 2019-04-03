/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"1","2","3","4"};
		String[] suits = {"black","red"};
		int[] values = {1,2,3,4};
		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1.toString());
		deck1.deal();
		deck1.deal();
		deck1.deal();
		System.out.println(deck1.toString());
	}
}
