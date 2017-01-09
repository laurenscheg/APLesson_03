import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the distance: ");
		int d = kb.nextInt();
		System.out.println("Enter the hours: ");
		int h = kb.nextInt();
		System.out.println("Enter the minutes: ");
		int m = kb.nextInt();
		int x = 0;
		MilesPerHour object = new MilesPerHour(d, h, m, x);
		
		System.out.println("If you travel " + d + " miles in " + h + " hours and " + m + " minutes, your speed is " + object.getMPH() + " mph.");
		
		System.out.println("Enter the new distance: ");
		int d2 = kb.nextInt();
		System.out.println("Enter the new hours: ");
		int h2 = kb.nextInt();
		System.out.println("Enter the new minutes: ");
		int m2 = kb.nextInt();
		
		object.setValues(d2, h2, m2, x);
		
		System.out.println("If you travel " + d2 + " miles in " + h2 + " hours and " + m2 + " minutes, your speed is " + object.getMPH() + " mph.");
		
	}
}