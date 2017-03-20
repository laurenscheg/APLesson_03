import java.util.ArrayList;
public class Satellite_1
{
   public static void main(String[]args)
   {
       ArrayList<Car> locate = new ArrayList<>();
	   double one = Math.random()*99+1;
	   double two = Math.random()*99+1;
       double[] position = new double[6];
		for(int i =0; i < 6; i++)
		{
			position[i] = Math.round((double)(Math.random()*100)+1);
		}
	   double[] honLoc = {5,6};
       locate.add(new Honda_1(honLoc));
       locate.add(new Toyota_1("8, 9"));
       locate.add(new GMC_1(3, 8));
	   int i = 0;
	   for(Car L : locate)
	   {
		   L.move(position[i], position[i+1]);
		   i+=2;
	   }


       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (Car L : locate)
       {
           printout += "\nLocation for " + L.getID() + ": (" + getLocation(L.getLoc()) + ")";
       }
	   
	   L.move(one,two);
	   
	    for (Car L : locate)
       {
           printout += "\nAfter " + L.getID() + " moved: (" + one + ", " + two + ")" + "\nNew location is: " +"(" getLocation(L.getLoc()) + ")" + "\n";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Car L : locate)
       {
           printout += "\nDistance for " + L.getID() + ": (" + getDistance(L.getLoc(), home)+ ")";
       }


       System.out.println(printout);
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}