public class Toyota_1 extends Car
{
	private double xLoc, yLoc;
	
	public Toyota_1()
	{
		xLoc = 0;
		yLoc = 0;
	}
	
	public Toyota_1(String c)
	{
		xLoc = Double.parseDouble(c.substring(0,1));
		yLoc = Double.parseDouble(c.substring(3));
	}
	
	public void move(double x, double y)
	{
		xLoc = x;
		yLoc = y;
		double[] location = {xLoc, yLoc};
	}
}