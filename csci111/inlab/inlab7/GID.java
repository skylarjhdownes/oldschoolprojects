
/**
 * 
 * @author Skylar Downes
 * @version 10/24/11
 */
public class GID
{
    String name;
    String gid;
    static int bigGID = Integer.MIN_VALUE;
    static int smallGID = Integer.MAX_VALUE;
    static String bigName;
    static String smallName;
    int counter = 0;
    /**
     * Constructor for objects of class GID
     */
    public GID(String in_name, String in_gid)
    {
        name = in_name;
        gid = in_gid;
        
            if (counter == 0)
            System.out.format("%s%19d");
            counter = 1;
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
        System.out.format("%-20s%08d", name, removeStar());
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
        return "*" + Integer.toString(bigGID);
    }
    public static String maxName()//returns the name of the person with the highest gid number
    {
        return bigName;
    }
        public static String minGID()//returns the smallest gid number
    {
        return "*" + Integer.toString(smallGID);
    }
    public static String minName()//returns the name of the person with the smallest gid number
    {
        return smallName;
    }
}
