import java.util.Scanner;
public class ReverseWord
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter five words: ");
		String[] words = new String[5];
		for (int i = 0; i < words.length; i++) 
		{
			words[i] = kb.next();
		}
		System.out.println("In order...");
		for (String word : words)
		{
			System.out.print("\n" + word);
		}
		System.out.println("\nReversed...");
		reverse(words);
	}
	
	public static void reverse(String[] words)
	{
		for (int i = words.length-1; i >= 0; i--)
		{
			System.out.print("\n" + words[i]);
		}
	}
}
