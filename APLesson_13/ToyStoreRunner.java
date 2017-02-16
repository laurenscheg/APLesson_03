import java.util.Scanner;
public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		String list = "";
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter toy list: \n");
		list = kb.nextLine();
		
		ToyStore a = new ToyStore(list);
		System.out.println(a);
		System.out.println("Most Frequent Toy: " + a.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + a.getMostFrequentType());
		;
	}
}
