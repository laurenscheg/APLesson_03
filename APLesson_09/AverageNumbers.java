public class AverageNumbers
{
	
	public static void main(String[]args)
	{
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) 
		{
			num[i] = (int)(Math.random()*100)+1;
		}
		
		for (int num2 : num)
		{
			System.out.print(num2 + " ");
		}
		System.out.println("\nThe average of the above numbers is... " + average(num));
		
		
	}
	
	public static int average(int[] num)
	{
		int average = 0;
		for (int i = 0; i < num.length; i++) 
		{
			average += num[i];
		}
		return average/num.length;
	}
}
