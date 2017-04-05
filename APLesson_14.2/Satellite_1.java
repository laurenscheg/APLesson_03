import java.util.*;
public class Satellite_1
{
    public static void main(String[]args) 
	{
        ArrayList<Car> Location = new ArrayList<>();
        double[] position = new double[6];
       
	   for(int i = 0; i < 6; i++) 
		{
        	position[i] = Math.round((double)(Math.random() * 100) + 1);
        }
        
		double[] honLoc = {5, 6};
		
        Location.add(new Honda_1(honLoc));
        Location.add(new Toyota_1("8, 9"));
        Location.add(new GMC_1(3, 8));
        int i = 0;
       
	   for(Car L : Location) 
		{
        	L.move(position[i], position[i+1]);
        	i += 2;
        }
        
		double[] home = {0, 0};
        String printout = "==========================\n" + "\nStarting locations: ";
        
		for(Car L : Location) 
		{
            printout += "\nLocation for " + L.getID() + ": (" + getLocation(L.getLoc()) + ")";
        }
        printout += "\n\n" + "==========================";
        i = 0;
        
		for(Car L : Location) 
		{
            double[] newPos = L.getLoc();
            double x = newPos[0], y = newPos[1];
            printout += "\n\nAfter " + L.getID() + " moved (" + position[i] + ", " + position[i+1] + ")"
            + "\nNew location: " + "(" + x + ", " + y + ")" + "\n";
            i += 2;
        }
        printout += "\n" + "==========================" + "\nDistance from home...";
        
		for(Car L : Location) 
		{
            printout += "\n\nDistance for " + L.getID() + ": (" + getDistance(L.getLoc(), home)+ ")";
        }
        System.out.println(printout);
    }
	
    public static double getDistance(double[] car, double[] home) 
	{
        return Math.round(Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2))));
    }
	
    public static String getLocation(double[] Loc) 
	{
        return Loc[0] + ", " + Loc[1];
    }
}