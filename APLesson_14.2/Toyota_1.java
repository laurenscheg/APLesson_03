import java.util.*;
public class Toyota_1 extends Car
{
	
	public Toyota_1(String c)
	{
		super();
		ArrayList<String> position = new ArrayList<>(Arrays.asList(c.split(", ")));
		double x1 = Double.parseDouble(position.get(0));
		double y1 = Double.parseDouble(position.get(1));
		
		super.move(x1, y1);
	}
	

}