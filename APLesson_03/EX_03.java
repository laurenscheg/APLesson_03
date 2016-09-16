import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("What is your first number?");
		
		int num1 = keyboard.nextInt();
		
		System.out.println("What is your second number?");
		
		int num2 = keyboard.nextInt();
		
		System.out.println("The multiplication of your two numbers is " + num1*num2);
	}
}	