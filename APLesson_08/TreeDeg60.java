import java.util.Scanner;
public class TreeDeg60
{
	

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = kb.next();
		int stop = word.length();
		int start = 1;
		
		tree(word, start, stop);
	}
	
	public static void tree(String w, int t, int p)
	{
		if (t <= p)
		{
			System.out.printf("%10s\n", w.substring(0,t));
			t++;
			tree(w, t, p);
		}
	}
}