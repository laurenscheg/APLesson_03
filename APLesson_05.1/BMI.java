import java.util.Scanner;
public class BMI
{
	static String bmi;
	static double bminumber;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your weight?");
		double weight = kb.nextDouble();
		
		System.out.println("What is your height?");
		double height = kb.nextDouble();
		bminumber = (weight * 703)/(height*height);
		
		calcBMI(bminumber);
		System.out.println("Your BMI is " + bminumber);
		System.out.println("You are " + bmi);
	}
	
	public static String calcBMI(double bminumber)
	{
		bmi = "";
		
		if (bminumber >= 39.9)
			bmi = "Morbidly Obese";
		else if (bminumber >= 35)
			bmi = "Very Obese";
		else if (bminumber >= 29.9)
			bmi = "Obese";
		else if (bminumber >= 25)
			bmi = "Overweight";
		else if (bminumber >= 18.5)
			bmi = "Normal";
		else
			bmi = "Underweight";
		
		return bmi;
	}
}