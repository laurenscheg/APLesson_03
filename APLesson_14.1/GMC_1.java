public class GMC_1 extends Car
{
	private double xLoc, yLoc;
	
	public GMC_1(double x, double y)
	{
		super();
		move(x,y);
	}
	
	public void move(double x, double y)
	{
		this.xLoc += x; 
		this.yLoc += y;
		
		
	}
	
	public double[] getLoc()
	{
		double[] location = {xLoc, yLoc};
		return location;
	}
}