import java.util.Scanner;
public class Password
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Enter your username:");
		String username = kb.next();
		System.out.println("Enter your password:");
		String password = kb.next();
		
		if (username.equals("username"))
		{
			if (password.equals("password"))
			{
				System.out.println("You are granted access!");
			}
			else 
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}	
		}
		
		else if (password.equals("password"))
		{
			
			System.out.println("Your username is incorrect!");
			passCheck();
		
		}
		
		else 
		{
			System.out.println("Your username and password are incorrect!");
			passCheck();
		}
	}
}