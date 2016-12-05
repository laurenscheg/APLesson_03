public class BiggestNumber
{
	public static void main(String[]args)
	{
		
		int[] num = new int[10];
		fillArray(num);
		System.out.print("For the following numbers ");
		printArray(num);
		System.out.println("\n The biggest number is " + getBiggest(num));
	

	}
	
	public static void fillArray(int[] num)
	{
		for (int i = 0; i < num.length; i++) 
		{
			num[i] = (int)(Math.random()*100)+1;
		}
		
	}
	
	public static void printArray(int[] num)
	{
		for (int num2 : num)
		{
			System.out.print(num2 + " ");
		}
	}
	
	public static int getBiggest(int[] num)
	{
		int max = 0;
		for (int num2 : num) 
		{
			if (num2 > max)
			{
				max = num2;
			}
			
		}
		return max;
	}
}	