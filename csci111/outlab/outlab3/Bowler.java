
/**
 * Write a description of class Bowler here.
 * 
 * @author Skylar Downes    
 * @version 9/23/11
 */
public class Bowler
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int ballsBowled;
    private int runs;
    private int wickets;

    /**
     * Constructor for objects of class Bowler
     */
    public Bowler(String in_firstName, String in_lastName, int in_ballsBowled, int in_runs, int in_wickets)
    {
        firstName = in_firstName;
        lastName = in_lastName;
        ballsBowled = in_ballsBowled;
        runs = in_runs;
        wickets = in_wickets;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   
    public double average()
    {return runs / wickets;
    }
    public double economy()
    {return runs / ballsBowled * 6;
    }
    public String getName()
    {return firstName + " " + lastName;
    }
}
