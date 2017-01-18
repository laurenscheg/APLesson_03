import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter hair: ");
		String h = kb.next();
		System.out.println("Enter eyes: ");
		String e = kb.next();
		System.out.println("Enter skin: ");
		String s = kb.next();

		
		Human humanInfo = new Human(h, e, s);
		System.out.println("Your Info: ");
		System.out.println("Hair:\t" + humanInfo.getHair());
		System.out.println("Eyes:\t" + humanInfo.getEyes());
		System.out.println("Skin:\t" + humanInfo.getSkin());
	}
}	