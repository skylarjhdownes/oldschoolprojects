
/**
 * 
 * @author Skylar Downes
 * @version 10/24/11
 */
public class GID
{
    String name;
    String gid;
    private static int bigGID = Integer.MIN_VALUE;
    static int smallGID = Integer.MAX_VALUE;
    static String bigName;
    static String smallName;
    static int counter1 = 0;
    static int counter2 = 0;
    String title1 = "Name";
    String title2 = "GID";
    /**
     * Constructor for objects of class GID
     */
    public GID(String in_name, String in_gid)
    {
        name = in_name;
        gid = in_gid;
        int intGID = removeStar();
        if (intGID > bigGID)
        {
            bigGID = intGID;
            bigName = name;
        }
        if (intGID < smallGID)
        {
            smallGID = intGID;
            smallName = name;
        }
        if (counter1 == 0)
        {
            System.out.format("%-23s%s%n", title1, title2);
            counter1 = 1;
        }
        printInfo();
    }
    
    /**
     */
    private int removeStar() // removes the star from the front of the gid
    {
        String noStar = gid.substring(1);
        return Integer.parseInt(noStar);
    }
    public void printInfo()// prints info on a person including gid
    {
        System.out.format("%-20s%s%n", name, gid);
    }
    public void compare()// contains a variable set to the highest value of removeStar()
    {
        if (removeStar() > bigGID)
        {
            bigGID = removeStar();
            bigName = name;
        }
        if (removeStar() < smallGID)
        {
            smallGID = removeStar();
            smallName = name;
        }
    }
    public static String maxGID()//returns the largest gid number
    {
        if (bigGID < 1000000)
        {
            return "*00" + Integer.toString(bigGID);
        }
        else if (bigGID < 10000000)
        {
            return "*0" + Integer.toString(bigGID);
        }
        else
        {
            return "*" + Integer.toString(bigGID);
        }
    }
    public static String maxName()//returns the name of the person with the highest gid number
    {
        return bigName;
    }
        public static String minGID()//returns the smallest gid number
    {
                if (smallGID < 1000000)
        {
            return "*00" + Integer.toString(smallGID);
        }
        else if (smallGID < 10000000)
        {
            return "*0" + Integer.toString(smallGID);
        }
        else
        {
            return "*" + Integer.toString(smallGID);
        }
    }
    public static String minName()//returns the name of the person with the smallest gid number
    {
        return smallName;
    }
        public static void reset()
    { 
        counter2 = 0;
        bigGID = Integer.MIN_VALUE;
        smallGID = Integer.MAX_VALUE;
    }
}
