import java.util.Scanner;
public class EX_01
{
	public static void main(String[]args)
	{
		EX_01 receipt = new EX_01();
		
		Scanner keyboard = new Scanner(System.in);
		
		//item 1
		System.out.println("Please enter item 1:");
		String item1 = keyboard.next();
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		
		//item 2
		System.out.println("Please enter item 2:");
		String item2 = keyboard.next();
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		
		//item 3
		System.out.println("Please enter item 3:");
		String item3 = keyboard.next();
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();		
		double subtotal = price1 + price2 + price3;
		double tax = subtotal*.09;
		double total = subtotal *1.09;	
		
		System.out.println("<<<<<<<<<<<<<<<Receipt>>>>>>>>>>>>>>>>");
		receipt.receiptformat(item1, price1);
		receipt.receiptformat(item2, price2);
		receipt.receiptformat(item3, price3);
		receipt.receiptformat("Subtotal", subtotal);
		receipt.receiptformat("Tax", tax);
		receipt.receiptformat("Total", total);
		System.out.println("\n_______________________________________\nThank you!!!");
	}	
	public void receiptformat(String item, double price)
	{

		System.out.printf("\n* %15s  ......  %5.2f", item, price);

	
	}
}
	

		
		