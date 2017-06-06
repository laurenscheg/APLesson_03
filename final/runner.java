import java.util.Scanner;
public class runner
{

    public static void main(String[] args)
    {
        punctuation punkd = new punctuation();
		capitalization capybara = new capitalization();
		contraction conair = new contraction();
		shortcuts shorty = new shortcuts();
		
		System.out.println(shorty.getCuts());

        System.out.println("Enter your text: ");
		
        Scanner kb = new Scanner (System.in);
        String t = kb.nextLine();
		String newt = "";

        while (!t.equals("exit"))
        {
			String wow = (shorty.getCorrection(t));
			
            System.out.println(conair.getCorrection(capybara.getCorrection(punkd.getCorrection(wow))));
			
            t = kb.nextLine();
        }
    }

}
