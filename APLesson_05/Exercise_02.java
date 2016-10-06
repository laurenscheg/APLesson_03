import java.util.Scanner;
public class Exercise_02
{
	static double price1;
	static double price2;
	static double price3;
	static double price4;
	static double subtotal;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter item 1: ");
		String item1 = kb.next();
		System.out.println("Enter the price of " + item1);
		 price1 = kb.nextDouble();
		System.out.println("Enter item 2: ");
		String item2 = kb.next();
		System.out.println("Enter the price of " + item2);
		 price2 = kb.nextDouble();
		System.out.println("Enter item 3: ");
		String item3 = kb.next();
		System.out.println("Enter the price of " + item3);
		 price3 = kb.nextDouble();
		System.out.println("Enter item 4: ");
		String item4 = kb.next();
		System.out.println("Enter the price of " + item4);
		 price4 = kb.nextDouble();
		
		 subtotal = price1 + price2 + price3 + price4;
		
		discount();
		print();
	}	
		
	public static double discount()	
	{
		boolean discount = subtotal >= 2000;
		if (discount)
			return .85 * subtotal;
		if (!discount)
			return subtotal
		
		
	}
	
	public static void print()
	{
		System.out.printf("Your total is %.2f", discount());
	}
	
	
}