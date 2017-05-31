import java.util.Scanner;
public class runner
{

    public static void main(String[] args)
    {
        punctuation punkd = new punctuation();
		capitalization capybara = new capitalization();
		conjunction conair = new conjunction();

        System.out.println ("Enter your text: ");
		
        Scanner in = new Scanner (System.in);
        String t = in.nextLine();
		String newt = "";

        while (!t.equals("exit"))
        {
            System.out.println (conair.getCorrection(capybara.getCorrection(punkd.getCorrection(t))));
			
            t = in.nextLine();
        }
    }

}
