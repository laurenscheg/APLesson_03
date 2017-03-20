public abstract class Car implements Location_1
{
	public final int ID;
	public double[] location;
	
	public Car()
	{
		ID = (int)(Math.random() * 1000000) + 1;
		location = new double[2];
	}
	
	public abstract void move(double x, double y);
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}