public class punctuation
{
    public String getCorrection(String text)
    {

        if(text.length()==0)
        {
            return "Please enter text.";
        }
		
        else
        {
			while(text.indexOf("  ") >= 0)
			{
				text = text.substring(0, text.indexOf("  "))+ ". " + text.substring(text.indexOf("  ")+2,text.length());
			}
        }
		
		return text;
    }
}

