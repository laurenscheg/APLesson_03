import java.util.Scanner;
public class Underscores
{
	static String sentence;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		sentence = kb.nextLine();
		replace();
		System.out.println(sentence);
	}
	
	public static String replace()
	{
		if (sentence.indexOf(" ")>=0)
		{
			return sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1);
		
		}
		else 
			return sentence;
		replace();
	}
}