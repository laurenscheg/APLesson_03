public class Toyota implements Location
{
	private double[] location;
	private double xLoc, yLoc;
	public Toyota()
	{
		super();
		location = new double[2];
	}
	
	public Toyota(String c)
	{
		xLoc = Double.parseDouble(c.substring(0,1));
		yLoc = Double.parseDouble(c.substring(3));
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