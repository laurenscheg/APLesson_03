import java.util.Scanner;
public class ReplaceAts
{
static String sentence;
static int num;

	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		sentence = kb.nextLine();
		num = number;
		
		digits = 0;
		average = 0;
		replace();
		System.out.println();
	}
	
	public static void replace()
	{
		while (num)
		{
			digits++;
			average = average + digits %10;
			num /= 10;
		}
		average = average/digits;
	}
}	