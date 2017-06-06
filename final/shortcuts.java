import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class shortcuts
{
	ArrayList<String> phrasies = new ArrayList<String>();
	ArrayList<String> shorties = new ArrayList<String>();
	Scanner kb = new Scanner(System.in);
	public String getCuts()
	{
		System.out.println("Would you like to add shortcuts? (Y/N)");
        String t = kb.nextLine();
		loop(t);
		return "";
	}
	
	public String loop(String x)
	{
		if (x.equals("Y"))
		{
			System.out.println("Enter the phrase to shorten: ");
			String phrase = kb.nextLine();
			phrasies.add(phrase);
			System.out.println("Enter the shortcut for " + phrase + ": ");
			String shortcut = kb.nextLine();
			shorties.add(shortcut);
			System.out.println("Would you like to enter another shortcut? (Y/N)");
			String a = kb.nextLine();
			if (a.equals("Y"))
			{
				loop(a);
			}
			
		}
		
		else if (x.equals("N"))
		{
			return "";
		}
		return "";
	}
	
	public String getCorrection(String text)
	{
		
		if(text.length()==0)
        {
            return "Please enter text.";
        }
		else
		{
			for(int i = 0; i < shorties.size(); i++)
			{
				String maddy = shorties.get(i);
				while (text.indexOf(maddy)>=0)
				{
					text = text.substring(0, text.indexOf(maddy)) + phrasies.get(i) + text.substring(text.indexOf(maddy)+maddy.length(),text.length());
				}	
			}
			return text;
		}
	}
}	