public class Inventory
{
	private String manufacturer, name, category;
	private int UPC;
	private double price;
	
	public Inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
	public Inventory(String man, String nam)
	{
		manufacturer = man;
		name = nam;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	
	public Inventory(String man, String nam, String cat, double pri)
	{
		manufacturer = man;
		name = nam;
		category = cat;
		price = pri;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	
	public String toString()
	{
		return "Manufacturer: " + manufacturer + "\nName: " + name + "\nCategory: " + category + "\nUPC: " + UPC + "\nPrice: " + price;
	}
}