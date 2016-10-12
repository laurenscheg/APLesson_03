import java.util.Scanner;
public class BMI
{
	static String bmi;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.prdoubleln("What is your weight?");
		double weight = keyboard.nextDouble();
		
		System.out.prdoubleln("What is your height?");
		double height = keyboard.nextDouble();
		
		System.out.printf("Your BMI(");
		System.out.printf("You are ", );
	}
	
	public static double calcBMI()
	{
		double bminumber = (weight * 703)/(height*height);
		String bmi = "";
		
		if (bminumber >= 39.9)
			bmi = "Morbidly Obese"
		else if (bminumber >= 35)
			bmi = "Very Obese"
		else if (bminumber >= 29.9)
			bmi = "Obese"
		else if (bminumber >= 25)
			bmi = "Overweight"
		else if (bminumber >= 18.5)
			bmi = "Normal"
		else if (bminumber < 18.5)
			bmi = "Underweight"
		return bminumber;
	}
}