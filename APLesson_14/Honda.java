public class Honda implements Location
{
	private double xLoc, yLoc;
	
	public Honda()
	{
		xLoc = 0;
		yLoc = 0;
	}
	
	public Honda(double [] location)
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