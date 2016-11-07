import java.util.Scanner;
public class Song
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		System.out.print("\n");
		sing("Na", 4);
		System.out.print("\n");
		sing("Hey", 3);
		System.out.print("\n");
		sing("Goodbye!", 1);
	}
	
	public static void sing(String word, int number)
	{
		for (int i = 1; i <= number; i++)
		{
			System.out.print(word + " ");
		}
	}
}	