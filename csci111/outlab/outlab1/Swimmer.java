
/**
 * Write a description of class Swimmer here.
 * 
 * @author Skylar Downes
 * @version 09/10/11
 */
public class Swimmer
{
    // instance variables - replace the example below with your own
    private String name;
    private double heat;
    private double semiFinals;
    private double finals;

    /**
     * Constructor for objects of class Swimmer
     */
 public Swimmer(String in_name, double in_heat, double in_semiFinals, double in_finals)
    {
        name = in_name;
        heat = in_heat;
        semiFinals = in_semiFinals;
        finals = in_finals;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   public double totalTime()
   {double totalTime = heat + semiFinals + finals;
       return totalTime;
    }// returns the sum of the swimmer’s three times
    public double averageTime1()
    {double averagetime1 = heat + semiFinals + finals;
        averagetime1 = averagetime1 / 3;
        return averagetime1;
    }// returns swimmer's average time
    public double averageTime2()
    {double total = totalTime();
        return total / 3;
    }// returns swimmer's average time using totalTime
    public double getFinals()
    {return finals;
    }// returns the swimmers time in the final
    public String getName()
    {return name;
    }// returns the swimmers name
}
