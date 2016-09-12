import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("I am a BMI calculator. \nWhat is your weight?");
		int weight = keyboard.nextInt();
		
		System.out.println("What is your height?");
		int height = keyboard.nextInt();
		int BMI = (weight * 703)/(height*height);
		
		System.out.println("Your BMI is " + BMI);
	}
}