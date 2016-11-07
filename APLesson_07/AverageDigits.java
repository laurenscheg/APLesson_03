import java.util.Scanner;
public class AverageDigits
{
static int number;
static int num;
static int digits;
static int average;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = kb.nextInt();
		num = number;
		
		digits = 0;
		average = 0;
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + average);
	}
	
	public static void avDigits()
	{
		while (num > 0)
		{
			digits++;
			average = average + digits %10;
			num /= 10;
		}
		average = average/digits;
	}
}	