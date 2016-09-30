import java.util.Scanner;
public class Rectangle
{
	static double length;
	static double width;
	static double perimeter;

	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length:");
		length = kb.nextDouble();
		System.out.println("Enter the width:");
		width = kb.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = length+length+width+width;
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is " + perimeter + " ft around.");
	}
}