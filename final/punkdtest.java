import java.util.Scanner;
public class punctuation
{
	
    public  String greeting()
    {
        return "Enter your text: ";
    }

    public String getCorrection(String text)
    {
        String correction = "";
		String newtext = "";

        if(text.length()==0)
        {
            correction = "Please enter text.";
        }

        else if(findError(text,"  ")>=0)
        {
            newtext = ". ";
			correction = text.substring(0, text.indexOf("  "))+ newtext + text.substring(text.indexOf("  ")+2,text.length());
			getCorrection(correction);
        }
			
		else
		{
			correction = text;
		}

        return correction;
		
    }

    private int findError(String text, String goal)
    {
        int psn = text.indexOf(goal);
        String before = "";
        String after = "";

        while (psn >= 0)
        {

            if (psn > 0)
            {
                before = text.substring(psn-1, psn);
            }
            if (psn + goal.length() < text.length())
            {
                after = text.substring(psn + goal.length(), psn + goal.length() + 1);
            }
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))&&((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
            {
                return psn;
            }
            else {
                psn = text.indexOf(goal, psn + 1);
            }
        }
		return 1;
    }

}
