import java.util.Scanner;
public class FirstLetter
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
		first(words);
	
	}
	
	public static void first(String[] words)
	{
		for (int i = 0; i < words.length; i++)
		{
			System.out.print("\n" + words[i].charAt(0));
		}
	}
}
