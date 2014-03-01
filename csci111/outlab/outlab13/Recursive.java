
/**
 * 
 * @author Skylar Downes
 * @version 12/5/11
 */
public class Recursive
{

    private static int minArrayRec(int[] myArr, int endIndex) 
    {
        if(endIndex == 0)
        {
            return myArr[0];
        }
        else
        {
            int firstPart = minArrayRec(myArr, endIndex - 1);
            return Math.min(firstPart, myArr[endIndex]);
        }
    }
    
    public static int minArray(int[] myArr)
    {
        return minArrayRec(myArr, myArr.length - 1);
    }
}