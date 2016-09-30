import java.util.Scanner;
public class Circle
{
	static double r;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius:");
		r = kb.nextDouble();
	
		calcArea();
		print();
	}
	
	public static double calcArea()
	{
		return (3.14*r*r);
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with radius %.5f is %.5f.", r, calcArea());
	}
}