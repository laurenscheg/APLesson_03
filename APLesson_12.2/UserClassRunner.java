import java.util.Scanner;
public class UserClassRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		UserClass user1;
		System.out.println("Enter your first name: ");
		String firstName = kb.next();
		System.out.println("Enter your last name: ");
		String lastName = kb.next();
		System.out.println("Would you like to create an avatar? Y or N ");
		String avatr = kb.next();
		if (avatr.equals("N"))
		{
			user1 = new UserClass(firstName, lastName);
		}
		else
		{
			System.out.println("Enter your avatar: ");
			String avatar = kb.next();
			user1 = new UserClass(firstName, lastName, avatar);

		}
		
		System.out.println(user1);
	}
}
