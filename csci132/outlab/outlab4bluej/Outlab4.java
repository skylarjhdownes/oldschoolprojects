import java.util.*;
public class Outlab4 {

    public static void main() {
        int i, j, n, temp, nextNumber;
        Boolean done = false;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        
        // Populate an array of the desired size with uniformly distributed 
        // random numbers
        System.out.print("Enter the number of random numbers to be generated: ");
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
        
        // Sort the array with the course version of selection sort.
        // Include instrumentation for counting the number of statements executed
        int statementCount = 0;
        for (int fill = 0; fill < listSize - 1;  fill++)
        {
            int posMin = fill;
            statementCount++;
            statementCount++;
            for (j = fill+1; j < listSize; j++)
            {
                statementCount++;
                if (list[j] < list[posMin])
                {
                    posMin = j;
                    statementCount++;
                }
                statementCount++;
                
                statementCount++; // add one for execution of the if statement
                                  // itself
            }
            temp = list[fill];
            list[fill] = list[posMin];
            list[posMin] = temp;
            statementCount = statementCount + 3;
            statementCount++; // add one for the last execution of the inner
                              // loop statement that kicks execution out of the loop
        }
        statementCount++; // add one for the last execution of the outer
                          // loop statement that kicks execution out of the loop
        
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
