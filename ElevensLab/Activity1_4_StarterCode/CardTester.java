/**
 * This is a class that tests the Card class.
 */
public class CardTester 
{
 
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card card1 = new Card("Ace", "Spades", 1);
		Card card2 = new Card("4", "Heart", 4);
		Card card3 = new Card("Ace", "Spades", 1);
		
				
		System.out.println("Do card1 and card2 match? " + card1.matches(card2));
		System.out.println("Do card1 and card3 match? " + card1.matches(card3));
		System.out.println(card1.toString());
 
 
	}
}
