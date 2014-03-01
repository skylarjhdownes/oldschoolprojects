
/**
 * Write a description of class Swimmer here.
 * 
 * @author Skylar Downes
 * @version 10/10/11
 */
public class Swimmer
{
    private String name; //the swimmers full name
    private double heat; // the swimmers time in their heat
    private double semiFinals; // the swimmers time in the semifinal
    private double finals; // the swimmers time in the final
    //class variable
    private static int numSwimmers = 0;
    private static double bestFinals = 9999999;
    private static double bestInSemifinals = 9999999;
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
        if (bestFinals > Math.abs(finals))
            bestFinals = Math.abs(finals);
        if (heat < 0 || semiFinals < 0 || finals < 0)
        {
            System.out.println("Negative time entered, ignoring the - ");
            heat = Math.abs(heat);
            semiFinals = Math.abs(semiFinals);
            finals = Math.abs(finals);
        }
    }
     public Swimmer(String in_name, double in_heat, double in_semiFinals)
    {
        name = in_name;
        heat = in_heat;
        semiFinals = in_semiFinals;
        finals = -1.0;
        numSwimmers ++;
        if (bestInSemifinals > Math.abs(semiFinals))
            bestInSemifinals = Math.abs(semiFinals);
                if (heat < 0 || semiFinals < 0)
        {
            System.out.println("Negative time entered, ignoring the - ");
            heat = Math.abs(heat);
            semiFinals = Math.abs(semiFinals);
        }
    }
     public Swimmer(String in_name, double in_heat)
    {
        name = in_name;
        heat = in_heat;
        semiFinals = -1.0;
        finals = -1.0;
        numSwimmers ++;
                if (heat < 0)
        {
            System.out.println("Negative time entered, ignoring the - ");
            heat = Math.abs(heat);
        }
    }

    /**
     * 
     */
    public static int getNumSwimmers() // returns the value of numSwimmers
    {return numSwimmers;
    }
    public static void reset()
    { numSwimmers = 0;
      bestFinals = 999999;
      bestInSemifinals = 999999;
    }
    public void reportFinals()
    {
        if (semiFinals < 0)
        {
           System.out.println(name + " was eliminated in the heats.");
        }
        else
        {
            if (finals < 0)
            {
        
                System.out.println(name + " was eliminated in the semifinals");
    
            }
            else
                System.out.println(name + "'s time in the finals was " + finals);
        }
    }
    public static void bestInFinals()
    {
        System.out.println("The best time in the finals was " + bestFinals);
    }
    
    public static void bestInSemifinals()
    {
        System.out.println("The best time in the semifinals was " + bestInSemifinals);
    }
    public double averageTime()
    {
        if (semiFinals < 0)
        {
            return heat;
        }
        else 
        {
            if (finals < 0)
            {
                return (heat + semiFinals) / 2;
            }
            else
            {
                return (heat + semiFinals + finals) / 3;
            }
        }
    }
    public double bestTime()
    {
        if (finals != -1 && semiFinals > finals && heat > finals)
        {
            return finals;
        }
        else if (semiFinals != -1 && heat > semiFinals)
        {
            return semiFinals;
        }
        else 
        {
            return heat;
        }
    }
    public Summary results()
    {
      return new Summary(name, averageTime(), bestTime());
        
        
    }
    public void changeTime(String event, double newTime)
    {
        if (event.equals("Final"))
        {
            finals = newTime;
        }
        else if (event.equals("Semifinal"))
        {
            semiFinals = newTime;
        }
        else if (event.equals("Heat"))
        {
            heat = newTime;
        }
        else
        {
            System.out.println("Invalid event change.");
        }
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
