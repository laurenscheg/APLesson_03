import java.util.Scanner;
public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter math letter grade: ");
		String math = kb.next();
		System.out.println("Enter science letter grade: ");
		String science = kb.next();
		System.out.println("Enter english letter grade: ");
		String english = kb.next();
		System.out.println("Enter history letter grade: ");
		String history = kb.next();
		System.out.println("Enter comp sci letter grade: ");
		String compsci = kb.next();
		System.out.println("Enter music letter grade: ");
		String music = kb.next();
		System.out.println("Enter pe letter grade: ");
		String pe = kb.next();
		
		double gPoints = calcPoints(science) + calcPoints(math) + calcPoints(english) + calcPoints(history) + calcPoints(compsci) + calcPoints(music) + calcPoints(pe);
		System.out.printf("Your gpa is %1.2f",(gPoints/7));
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("F"))
			return 0.0;
		else
			return 0.0;
	}
}