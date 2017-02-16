public class GameRunner
{
	public static void main(String[]args)
	{
		XBox xb = new XBox("XBox 360");
		System.out.println(xb);
		
		PlayStation ps = new PlayStation("PS4");
		System.out.println(ps);
		
		PC pc = new PC("Windows");
		System.out.println(pc);
	}
}