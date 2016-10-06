import java.util.Random;
public class Exercise_01
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int roll1 = rand.nextInt(6)+1;
		int roll2 = rand.nextInt(6)+1;
		
		System.out.println("You rolled a " + roll1);
		System.out.println("The computer rolled a " + roll2);
		
		boolean win = roll1 > roll2;
		if (win)
			System.out.println("You win!");
		if (!win)
			System.out.println("You lose!");
	
		}
}