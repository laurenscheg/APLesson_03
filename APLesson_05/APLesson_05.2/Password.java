import java.util.Scanner;
public class Password
{
	static Scanner kb;
	static String username1;
	static String password1;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		username1 = username;
		password1 = password;
		
	}
	
	public static void passCheck()
	{
		System.out.println("Enter your username:");
		String username2 = kb.next();
		System.out.println("Enter your password:");
		String password2 = kb.next();
	}
}