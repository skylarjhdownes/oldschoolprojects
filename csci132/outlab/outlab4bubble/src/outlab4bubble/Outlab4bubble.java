
package outlab4bubble;
/**
 *
 * @author Skylar Downes
 */
import java.util.*;
public class Outlab4bubble {

    public static void main(String[] args) {
        int i, j, n, temp, nextNumber;
        Boolean done = false;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random(314159);
        
        // Populate an array of the desired size with uniformly distributed 
        // random numbers
        System.out.print("Enter the number of random numbers to be generated in the bubble sort: ");
        int listSize = keyboard.nextInt();
        int[] list = new int[listSize];
        i = 0;
        while (i < listSize){
            list[i] = generator.nextInt();
            i++;
        }
        
        // Print the randomly generated random numbers for inspection
        System.out.println();
        for (i = 0; i < listSize; i++)
        {
             System.out.print(list[i] + " ");
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
                if (list[i] < list[i+1])
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
        System.out.println("The number of statements executed was: " 
                + statementCount + ".");
        System.out.println();
        
        // Print the array to be sure it is sorted
        for (i = 0; i <= listSize-1; i++)
        {
             System.out.print(list[i] + " ");
        }
        System.out.println();               
    }
}
