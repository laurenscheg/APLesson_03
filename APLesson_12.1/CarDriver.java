import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter paint: ");
		String p = kb.next();
		System.out.println("Enter interior: ");
		String i = kb.next();
		System.out.println("Enter engine: ");
		String e = kb.next();
		System.out.println("Enter tires: ");
		String t = kb.next();
		
		Car carInfo = new Car(p, i, e, t);
		System.out.println("Your vehicle is ready.....");
		System.out.println("Paint:\t" + carInfo.getPaint());
		System.out.println("Interior:\t" + carInfo.getInterior());
		System.out.println("Engine:\t" + carInfo.getEngine());
		System.out.println("Tires:\t" + carInfo.getTires());
	}
}	