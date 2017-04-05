public class Honda_1 extends Car
{
	private double xLoc, yLoc;
	
	public Honda_1(double [] location)
	{
		super();
		move(location[0], location[1]);
	
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