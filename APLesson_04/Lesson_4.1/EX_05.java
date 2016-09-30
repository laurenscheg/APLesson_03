import java.util.Scanner;
public class EX_05
{
	public static void main(String[]args)
	{
		EX_05 box = new EX_05();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the height:");
		double height = kb.nextDouble();
		System.out.println("Enter the length:");
		double length = kb.nextDouble();
		System.out.println("Enter the width:");
		double width = kb.nextDouble();
		
		double volume = box.calcVol(height, length, width);
		System.out.printf("The volume is %-10.2f", volume);
	}

	public double calcVol(double h, double l, double w)
	{
		return (h*l*w);
	}
}