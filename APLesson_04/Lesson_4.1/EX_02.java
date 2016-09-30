import java.util.Scanner;
public class EX_02
{
	public static void main(String[]args)
	{
		EX_02 id = new EX_02 ();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String name1 = kb.nextLine();
		System.out.println("Enter your last name:");
		String name2 = kb.nextLine();
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		System.out.println("Enter your school name:");
		String school = kb.nextLine();
		System.out.println("Enter your school year:");
		String year = kb.nextLine();
		System.out.println("Enter your subject:");
		String subject = kb.nextLine();
		
		System.out.println("************************************");
		id.idformat(school, year);
		id.idformat(name1, name2);
		id.idformat(title, subject);
		System.out.println("\n************************************");
	}
	public void idformat (String name, String thing)
	{
		System.out.printf("\n* %-15s   %15s*", name, thing);
	}
}