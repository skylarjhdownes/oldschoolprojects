
/**
 * Write a description of class ThreeInts here.
 * 
 * @author Skylar Downes
 * @version 10/17/11
 */
public class ThreeInts
{
    int int1;
    int int2;
    int int3;
    /**
     * Constructor for objects of class ThreeInts
     */
    public ThreeInts(int in_int1, int in_int2, int in_int3)
    {
        int1 = in_int1;
        int2 = in_int2;
        int3 = in_int3;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public int getint1()
    {
        return int1;
    }
        public int getint2()
    {
        return int2;
    }
        public int getint3()
    {
        return int3;
    }
    public void outvals()
    {
        System.out.format("%d, %d, %d", int1, int2, int3);
    }
}
