public class Honda_1 extends Car
{
	private double xLoc, yLoc;
	
	public Honda_1()
	{
		xLoc = 0;
		yLoc = 0;
	}
	
	public Honda_1(double [] location)
	{
		xLoc = location[0];
		yLoc = location[1];
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public double[] getLoc()
	{
		double[] location = {xLoc, yLoc};
		return location;
	}
}