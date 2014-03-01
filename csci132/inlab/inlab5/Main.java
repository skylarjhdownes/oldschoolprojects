import java.util.*;
/**
 * inlab5
 * Skylar Downes/Kyler Callahan
 * 02/14/12
 */
public class Main
{
    public static void Main()
    {
        Scanner in = new Scanner(System.in);
        // instance variables - replace the example below with your own
        int listSize = 5;
        int[] list = new int[listSize];
        int holder = 0;
        int pointer = 0;
        
        for (int i = 0; i < listSize; i++)
        {
            System.out.println("Enter an int to put in the array");
            list[i] = in.nextInt();
        }
        System.out.println("Array is full now. Good job.");
                System.out.println("Here is your array.  Isn't it so cool?");
        for (int i = 0; i < listSize-1; i++)
        {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[listSize-1] + ".");
        for (int i = 0; i < listSize; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j = i; j < listSize; j++)
            {
                if (list[j] < min)
                {
                    min = list[j];
                    pointer = j;
                }
            }
            holder = list[i];
            list[i] = min;
            list[pointer] = holder;
        }
        System.out.println("This is the array after it has been sorted by the super-cool sorting thingy.");
        for (int i = 0; i < listSize - 1; i++)
        {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[listSize-1] + ".");
    }
}
