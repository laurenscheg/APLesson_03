public class GMC implements Location
{
	double xLoc, yLoc;
	
	public GMC()
	{
		xLoc = 0;
		yLoc = 0;
	}
	
	public GMC(double x, double y)
	{
		xLoc = x;
		yLoc = y;
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