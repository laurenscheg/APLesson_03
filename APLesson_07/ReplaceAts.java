import java.util.Scanner;
public class ReplaceAts
{
static String sentence;
static String sent;


	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		sentence = kb.nextLine();
		
		
		
		replace();
		System.out.println(sent);
	}
	
	public static void replace()
	{
		sent = "";
		int i = 0;
		while (i < sentence.length())
		{
			Character x = sentence.charAt(i);
			if (x.equals('a'))
			{
				x = '@';
			}
			sent = sent + x;
			i++;
		}
		
	}
}	