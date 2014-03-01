
/**
 * @author Skylar Downes
 * @version 11/1/11
 */
public class FirstArrays
{
    public static void main() // a set of arrays
    {     
        int[] arr1 = {2, 5, 3, 8, 4, 1},
            arr2 = {-1, -1, -1, -1},
            arr3 = {-3, -2, -1, 0, 1, 2, 3},
            arr4 = {3, 2, 1, 0, -1, -2, -3},
            arr5 = {2},
            arr6 = {};
        big2(arr1);
        big2(arr2);
        big2(arr3);
        big2(arr4);
        big2(arr5);
        big2(arr6);
    }
    public static void big2(int[] myArr) //checks if an array contains less than two ints, then finds the two largest ints
    {
       int big = Integer.MIN_VALUE;
       int smaller = Integer.MIN_VALUE;
       int num = 0;
       int n = 0;
       int holder;
        if(myArr.length < 2)
        {
        print1DIntArr(myArr);
        System.out.println(": This array is too short");
        }
        else 
        {
            for (int i = 0; i < myArr.length; i++)
            {
                if (myArr[i] > big)
                {
                big = myArr[i];
                holder = i;
                }
            }            
            for (int i = 0; i < myArr.length; i++)
            {
                if  (holder != i && myArr[i] > smaller)
                {
                smaller = myArr[i];
                }
            }  
            /* do 
            {
                if (myArr[n] != myArr[n+1])
                num = 1;
                n++;
            } while(n < myArr.length);
            if (num == 0)
            {
                smaller = big;
            } */
            print1DIntArr(myArr);
            System.out.format(": The two biggest values are %s and %s%n", big, smaller);
        }
    }
    private static void print1DIntArr(int[] intArr)
    {
        for (int i = 0; i < intArr.length; i++)
        {
        System.out.print(intArr[i] + " ");
        }
    }
}
