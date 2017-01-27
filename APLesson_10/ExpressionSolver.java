import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String eqn = kb.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(eqn.split(" ")));
		System.out.println(doEquation(equation));
		
	}
	
	public static ArrayList<String> doEquation(ArrayList<String> equation)
	{
		int x = 0; 
		
		while(x < equation.size())
		{
			
			if(equation.get(x).equals("*") || equation.get(x).equals("/"))
			{
				if(equation.get(x).equals("*"))
				{
					equation.set(x, "" + (Integer.parseInt(equation.get(x-1)) * (Integer.parseInt(equation.get(x+1)))));
				}
				else
				{
					equation.set(x, "" + (Integer.parseInt(equation.get(x-1)) / (Integer.parseInt(equation.get(x+1)))));
				}
				equation.remove(x-1);
				equation.remove(x);
			}
			else
			{
				x++;
			}
		}
		x=0;
		
		while (x < equation.size()) 
		{
			if(equation.get(x).equals("+") || equation.get(x).equals("-"))
			{
				if(equation.get(x).equals("+"))
				{
					equation.set(x, "" + (Integer.parseInt(equation.get(x-1)) + (Integer.parseInt(equation.get(x+1)))));
				}
				else
				{
					equation.set(x, "" + (Integer.parseInt(equation.get(x-1)) - (Integer.parseInt(equation.get(x+1)))));
				}
				equation.remove(x-1);
				equation.remove(x);
			}
			else
			{
				x++;
			}
			
		
		}
		return equation;
	}	
}