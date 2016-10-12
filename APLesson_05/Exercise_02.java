import java.util.Scanner;
public class Exercise_02
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter item 1: ");
		String item1 = kb.next();
		System.out.println("Enter the price of " + item1);
		double price1 = kb.nextDouble();
		System.out.println("Enter item 2: ");
		String item2 = kb.next();
		System.out.println("Enter the price of " + item2);
		double price2 = kb.nextDouble();
		System.out.println("Enter item 3: ");
		String item3 = kb.next();
		System.out.println("Enter the price of " + item3);
		double price3 = kb.nextDouble();
		System.out.println("Enter item 4: ");
		String item4 = kb.next();
		System.out.println("Enter the price of " + item4);
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDiscount(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Subtotal", subtotal);
		format("Discount", discount);
		format("Tax", tax);
		format("Total", total);
		System.out.println("___________________________________");
		System.out.println("Thank You!");
	}	
		
	public static double calcDiscount(double subtotal)	
	{
		if (subtotal >= 2000)
			return .15 * subtotal;
		return 0.0;
		
		
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("%15s ........................ %.2f\n", item, price);
	}
	
	
}