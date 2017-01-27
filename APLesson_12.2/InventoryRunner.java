import java.util.Scanner;
public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Inventory inv;
		System.out.println("Enter the item name: ");
		String name = kb.next();
		System.out.println("Enter the item manufacturer: ");
		String manufacturer = kb.next();
		System.out.println("Would you like to enter item category and price? Y or N ");
		String info = kb.next();
		
		if (info.equals("N"))
		{
			inv = new Inventory(manufacturer, name);
		}
		else
		{
			System.out.println("Enter item category: ");
			String category = kb.next();
			System.out.println("Enter item price: ");
			double price = kb.nextDouble();
			inv = new Inventory(manufacturer, name, category, price);
		}
		System.out.println(inv);
	}
}	