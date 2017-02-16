public abstract class Console extends GameSystem
{
	public abstract String getController();
	
	public Console()
	{
		super();
	}
	
	public Console(String x)
	{
		super(x);
	}
	
	public String toString()
	{
		return "Platform: [" + getPlatform() + "]\n" + "Serial #: [" + getSerialNo() + "]\n" + "Controller: [" + getController() + "]\n";
	}
}