import java.util.*;
public class Toyota_1 extends Car
{
	private double xLoc, yLoc;
	
	public Toyota_1(String c)
	{
		super();
		ArrayList<String> position = new ArrayList<>(Arrays.asList(c.split(", ")));
		double x1 = Double.parseDouble(position.get(0));
		double y1 = Double.parseDouble(position.get(1));
		
		move(x1, y1);
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