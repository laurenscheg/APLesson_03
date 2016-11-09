import java.util.Scanner;
public class Center
{
	static String word1;
	static String word2;
	static String word3;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		word1 = kb.next();
		System.out.println("Enter a word: ");
		word2 = kb.next();
		System.out.println("Enter a word: ");
		word3 = kb.next();
		
		makeCenter(word1);
		System.out.println(word);
	}
	
	public static String makeCenter(String word)
	{
	
		if (word.length() >= 20)
		{
			System.out.println(word);
		}
		else
		{
			return word = " " + " ";
		}
	}
}	