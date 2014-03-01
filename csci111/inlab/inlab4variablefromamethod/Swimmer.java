
/**
 * Write a description of class Swimmer here.
 * 
 * @author Skylar Downes
 * @version 9/27/11
 */
public class Swimmer
{
    private String name; //the swimmers full name
    private double heat; // the swimmers time in their heat
    private double semiFinals; // the swimmers time in the semifinal
    private double finals; // the swimmers time in the final
    //class variable
    private static int numSwimmers = 0;
    /**
     * Constructor for objects of class Swimmer
     */
 public Swimmer(String in_name, double in_heat, double in_semiFinals, double in_finals)
    {
        name = in_name;
        heat = in_heat;
        semiFinals = in_semiFinals;
        finals = in_finals;
        numSwimmers ++;
    }
     public Swimmer(String in_name, double in_heat, double in_semiFinals)
    {
        name = in_name;
        heat = in_heat;
        semiFinals = in_semiFinals;
        finals = -1.0;
        numSwimmers ++;
    }
     public Swimmer(String in_name, double in_heat)
    {
        name = in_name;
        heat = in_heat;
        semiFinals = -1.0;
        finals = -1.0;
        numSwimmers ++;
    }

    /**
     * 
     */
    public static int getNumSwimmers() // returns the value of numSwimmers
    {return numSwimmers;
    }
    public static void reset()
    { numSwimmers = 0;
    }
    public void reportFinals()
    {if (finals < 0)
        System.out.println(name + " didn't make it to the finals");
     else
        System.out.println(name + "'s time in the finals was " + finals);
    }
    
    
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
