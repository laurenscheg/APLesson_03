import java.util.Scanner;
public class FindTheZs
{
	public static void main(String[]args)
	{
		
		String[] words = new String[5];
		fillArray(words);
		System.out.print("For the following words ");
		printArray(words);
		System.out.println("The words that have Z's are " + hasZs(words));
	

	}
	
	public static void fillArray(String[] words)
	{	
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words: ");
		for (int i = 0; i < words.length; i++) 
		{
		
			words[i] = kb.next();
		}
		
	}
	
	public static void printArray(String[] words)
	{
		for (String word : words)
		{
			System.out.print(word + " ");
		}
	}
	
	public static String hasZs(String[] words)
	{
		String zs = "";
		for (String word : words) 
		{
			if (word.indexOf("z") >= 0)
			{
				zs += word + " ";
			}
			
		}
		return zs;
	}
}	