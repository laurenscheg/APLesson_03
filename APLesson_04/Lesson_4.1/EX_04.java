import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{
		EX_04 loan = new EX_04();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the interest rate:");
		double interest = kb.nextDouble();
		System.out.println("Enter the principal:");
		double principal = kb.nextDouble();
		System.out.println("Enter the number of times the loan is compounded per year:");
		double number = kb.nextDouble();
		System.out.println("Enter the life of the loan:");
		double time = kb.nextDouble();
		
		double amount = loan.calcLoan(interest, principal, number, time);
		System.out.printf("Your total monthly payment amount is $%.2f", amount);
	}
	
	public double calcLoan(double r, double p, double n, double t)
	{
		return (p*(Math.pow((1+r/n),(n*t)))/12.0);
	}
}