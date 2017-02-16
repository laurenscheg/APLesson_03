public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	
	public PC(String x)
	{
		super(x);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	public String toString()
	{
		return "Platform: [" + getPlatform() + "]\n" + "Serial #: [" + getSerialNo() + "]\n" + "System Input: [" + systemInput() + "]\n";
	}
}