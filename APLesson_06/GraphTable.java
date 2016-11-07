import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int number = kb.nextInt();
		System.out.println("Enter the size of the table: ");
		int size = kb.nextInt();
		
		for(int i = 1; i <= size; i++)
		{
			System.out.println(i + "\t" + i*number);
		}
	}
}	