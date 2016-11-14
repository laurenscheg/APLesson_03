import java.util.Scanner;
public class Center
{
	static String word1;
	static String word2;
	static String word3;
	static String word;

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
		makeCenter(word2);
		makeCenter(word3);
		
	}
	
	public static void  makeCenter(String word4)
	{
	
		if (word4.length() >= 20)
		{
			System.out.println(word4);
		}
		else
		{
			word = " " + word4 + " ";
			makeCenter(word);
		}
	} 
}	