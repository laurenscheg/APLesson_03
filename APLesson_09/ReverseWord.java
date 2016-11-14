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
		
		for (String word : words)
		{
			System.out.print(word);
		}
		
	}
}
