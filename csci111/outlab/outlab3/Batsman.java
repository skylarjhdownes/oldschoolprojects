
/**
 * Write a description of class Batsman here.
 * 
 * @author Skylar Downes  
 * @version 9/20/11
 */
public class Batsman
{
    private String name;
    private int matches;
    private int innings;
    private int notOut;
    private int runs;
    private int ballsFaced;

    /**
     * Constructor for objects of class Batsman
     */
    public Batsman(String in_name, int in_matches, int in_innings, int in_notOut, int in_runs, int in_ballsFaced)
    {
        name = in_name;
        matches = in_matches;
        innings = in_innings;
        notOut = in_notOut;
        runs = in_runs;
        ballsFaced = in_ballsFaced;
    }

    /**
     *
     * 
     *
     */
    public double average() //returns the players batting average
    {return runs / (innings - notOut);
    }
    public double scoringRate() // returns the players score rate
    {return runs / ballsFaced * 100;
    }
    public String getName() //returns the name of the batsman
    {return name;
    }
    public int getMatches() //returns the number of matches played
    {return matches;
    }
    public void batInfo()
    {System.out.println(name + "'s batting stats: ");
        System.out.println("    Batting Average: " + average());
        System.out.println("    Scoring rate: " + scoringRate());
        System.out.println("    Matches played :" + getMatches());
    }
}
