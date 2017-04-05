public abstract class Car implements Location_1
{
	private final int ID;
	private double[] location = new double[2];
	public Car()
	{
		ID = (int)(Math.random() * 1000000) + 1;

	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[0] += y;
		
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
}