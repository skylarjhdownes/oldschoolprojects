
/**
 * Write a description of class Cricket here.
 * 
 * @author Skylar Downes
 * @version 9/26/11
 */
public class Cricket
{

    public static void bowlInfo(Bowler bowl)
    {System.out.println("Bowler's stats");
        System.out.println(bowl + "'s batting stats: ");
        System.out.println("    Bowling Average: " + bowl.average());
        System.out.println("    Bowling Economy: " + bowl.economy());
    }
    public static void main()
    {
        // Two batsmen and two bowlers for testing
        
        Batsman chinBat = new Batsman("Graeme Swann", 36, 40, 6, 800, 979),
        bat2 = new Batsman("Stuart Broad", 41, 53, 7, 1335, 2101);
        Bowler bowl1 = new Bowler("Graeme", "Swann", 8903, 4410, 153),
        bowl2 = new Bowler("Stuart", "Broad", 8315, 4225, 132);
        
        chinBat.batInfo();
        bat2.batInfo();
        bowlInfo(bowl1);
        bowlInfo(bowl2);
    }
}
