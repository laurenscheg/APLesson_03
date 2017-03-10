public abstract class Car implements Location_1
{
	private int ID;
	
	public Car()
	{
		ID = (int)(Math.random() * 1000000) + 1;
	}
	
	public abstract void move(double x, double y);
}