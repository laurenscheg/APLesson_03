import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello, I am here to ask you questions. \nWhat is your name? ");
		
		String name = keyboard.next();
		
		System.out.println(name + "?! Interesting... ");
		System.out.println("How old are you, " + name + "?");
		
		int age = keyboard.nextInt();
		
		System.out.println(age + "? I should have guessed...");
		System.out.println("What do you do for fun, " + name + "?");
		
		String fun = keyboard.next();
		
		System.out.println(fun + ", how original.");
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next(); 
		
		System.out.println(music + "? Okaaaaaay then, " + name + ".");
		System.out.println("How many siblings do you have?");
		
		String siblings = keyboard.next();
		
		System.out.println(siblings + ", oh. You're one of thoooose people.");
		System.out.println("Most importantly, " + name + ", what do you want to be when you grow up?");
		
		String job = keyboard.next();
		
		System.out.println("Hahahahaha. A " + job + "? You should just quit now.");
		System.out.println("So, " + name + ", you are " + age + ", you like to " + fun + " and " + music + " music, and if you are lucky maybe you'll be a " + job + ". \nAnyways, have a spectacular day!");
		
	}
}