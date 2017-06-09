/**
 * This is a class that tests the Deck class.
 */
public class DeckTester 
{
 
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] rank1 = {"Ace", "2", "3"};
		String[] suit1 = {"Spades", "Hearts", "Diamonds"};
		int[] value1 = {1, 2, 3};
	    	Deck deck1 = new Deck(rank1, suit1, value1);
	    	System.out.println("What is the size of deck1? " + deck1.size());
	    
	    	String[] rank2 = {"4", "5", "6"};
	    	String[] suit2 = {"Diamonds", "Spades", "Diamonds"};
	    	int[] value2 = {4, 5, 6};
	    	Deck deck2 = new Deck(rank2, suit2, value2);
	    	System.out.println("Is deck2 empty? " + deck2.isEmpty());
	    
		 String[] rank3 = {"7", "8", "9"};
		 String[] suit3 = {"Spades", "Diamonds", "Clubs"};
		 int[] value3 = {7, 8, 9};
		 Deck deck3 = new Deck(rank3, suit3, value3);
		 System.out.println("What card is dealt? " + deck3.deal());
 
	/////////////////full deck
		String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs};
		int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck deck = new Deck(rank, suit, value);
		//System.out.println(deck);
		System.out.println("What card is dealt? " + deck.deal());
		
	}

}
