import java.util.Scanner;
public class Lucky7s
{
	static int seven;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		luck(number);
	}
	public static void luck(int num)
	{
		
		if (num > 0)
		{
			if (num%10 == 7)
			{
				seven++;
				luck(num/10);
			}
			else
			{
				luck(num/10);
			}
			
		}
		else
		{
			System.out.println(seven);
		}
	}
}	