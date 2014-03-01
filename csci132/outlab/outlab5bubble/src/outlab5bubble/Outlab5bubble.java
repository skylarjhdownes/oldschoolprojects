/*
 * 
 * 
 * 
 * 
 * 
 * This sorts the list into greatest to smallest.  The lab does not specify which is required, so I assume this is okay?
 * 
 * 
 * 
 * 
 * 
 */
package outlab5bubble;

import java.util.*;
public class Outlab5bubble {

    public static void main(String[] args) {
        int i, j, n, nextNumber;
        Droid temp;
        Boolean done = false;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random(314159);

        System.out.print("Enter the number of droids to create: "); 

        int listSize = keyboard.nextInt();
        Droid [] list = new Droid[listSize];

        i = 0;
        while (i < listSize)
        {
        list[i] = new Droid();
        list[i].setId(generator.nextInt());
        list[i].setName("R2D" + i);
        i++;
        }
        
        
        // Print the randomly generated random numbers for inspection
        System.out.println();
        for (i = 0; i < listSize; i++)
        {
             System.out.print(list[i].getName() + " with ID " + list[i].getId() + " ");
        }
        System.out.println();
        
        // Sort the array with the bubble sort.
        // Include instrumentation for counting the number of statements executed
        int statementCount = 0;
        int pass = 1;
        boolean exchanges = false;
        statementCount += 2;
        do {
            exchanges = false;
            statementCount ++;
            for (i = 0; i < listSize - pass; i++)
            {
                if (list[i].getId() < list[i+1].getId())
                {
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    exchanges = true;
                    statementCount += 4;
                }
                statementCount ++;
            }
            statementCount ++;
            pass++;
            statementCount ++;
        }while (exchanges);
        statementCount ++;
        
        // Print the number of statements executed for use in run time complexity
        // analysis
        System.out.println();
        //System.out.println("The number of statements executed was: " 
        //        + statementCount + ".");
        System.out.println();
        
        // Print the array to be sure it is sorted
        for (i = 0; i <= listSize-1; i++)
        {
             System.out.print(list[i].getName() + " with ID " + list[i].getId() + " ");
        }
        System.out.println();               
    }
}
