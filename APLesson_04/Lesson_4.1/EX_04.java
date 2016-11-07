import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{
		EX_04 loan = new EX_04();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the interest rate:");
		double r = kb.nextDouble();
		System.out.println("Enter the principal:");
		double p = kb.nextDouble();
		System.out.println("Enter the number of times the loan is compounded per year:");
		double n = kb.nextDouble();
		System.out.println("Enter the life of the loan:");
		double t = kb.nextDouble();
		
		double amount = loan.calcLoan(r, p, n, t);
		System.out.printf("Your total monthly payment amount is $%.2f", amount/12.0);
	}
	
	public double calcLoan(double r, double p, double n, double t)
	{
		return p*(Math.pow((1+(r/n)),(n*t)));
	}
}