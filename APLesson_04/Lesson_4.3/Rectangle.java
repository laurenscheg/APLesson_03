import java.util.Scanner;
public class Rectangle
{
	static double length;
	static double width;

	
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
	
	public static double calcPerim()
	{
		return length+length+width+width;
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f ft around.", calcPerim());
	}
}