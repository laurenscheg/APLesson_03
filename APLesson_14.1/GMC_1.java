public class GMC_1 extends Car
{
	double xLoc, yLoc;
	
	public GMC_1()
	{
		xLoc = 0;
		yLoc = 0;
	}
	
	public GMC_1(double x, double y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public void move(double x, double y)
	{
		xLoc = x;
		yLoc = y;
		
		double[] location = {xLoc, yLoc};
	}
}