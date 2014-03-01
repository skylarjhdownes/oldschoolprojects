
/**
 * Write a description of class Recursive here.
 * 
 * @author Skylar Downes
 * @version 11/29/11
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
    
    private static int largeIndex(int[] myArr, int endIndex)
    {
        int largest = myArr[0];
        int index = 0;
        for (int i = 1; i <= endIndex; i++)
        {
            if (myArr[i] > largest)
            {
                largest = myArr[i];
                index = i;
            }
        }
        return index;
    }
    
    private static int[] sortRecursive(int[] myArr, int endIndex)
    {
        
        
        if (endIndex > 0)
        {
            int holdersmall = myArr[endIndex];
            int endVal = largeIndex(myArr, endIndex);
            int holderbig = myArr[endVal];
            myArr[endVal] = holdersmall;
            myArr[endIndex] = holderbig;
            sortRecursive(myArr, endIndex - 1);
        }
        
        return myArr;
    }
    
    public static int[] sort(int[] myArr)
    {
        return sortRecursive(myArr, myArr.length - 1);
    }
}
