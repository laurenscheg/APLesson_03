import java.util.Scanner;
public class Count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the inital number: ");
		int number1 = kb.nextInt();
		System.out.println("Enter the number you are going to: ");
		int number2 = kb.nextInt();
		
		for(int i = number1; i <= number2; i = i + number1)
		{
			System.out.print(i + "\t");
		}
	}
}	