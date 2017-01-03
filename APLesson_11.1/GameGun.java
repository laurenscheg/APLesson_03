import java.util.Scanner;
public class GameGun
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String[]clip;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		bulletCount = 96;
		shotCount = 0;
		clip = new String[CLIPSIZE];
		resetClip();
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String choice = kb.next();
			if (choice.equals("R"))
			{
				reload();
			}
			if (choice.equals("S"))
			{
				shoot(shotCount);
			}
			printClip(CLIPSIZE);
		}
		
		System.out.println("Out of Bullets!!!");
		
	}
	
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot(int shotCount)
	{
		String response;
		if (shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			response = "Boom!!";
		}
		else
		{
			response = "Reload!!";
		}
		return response;
	}
	
	public static void reload()
	{
		if (bulletCount >= CLIPSIZE)
		{
			bulletCount = bulletCount - CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = " * ";
		}
	}
	
	public static String printClip(int CLIPSIZE)
	{
		String output = "";
		for(int i = 0; i < CLIPSIZE; i++)
		{
			output += clip[i];
		}
		return "Bullets:\t" + bulletCount + "\nClip:\t"+ output;
	}
	
}	