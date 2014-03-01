import java.util.*;
public class Main {

    public static void main() {
        int i, j, n, temp, nextNumber;
        Boolean done = false;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        
        System.out.print("Enter the number of random numbers to be generated: ");
        int listSize = keyboard.nextInt();
        int[] list = new int[listSize];
        i = 0;
        while (i < listSize){
            list[i] = generator.nextInt();
            i++;
        }
        
        System.out.println();
        for (i = 0; i < listSize; i++)
        {
             System.out.print(list[i] + " ");
        }
        System.out.println();
                
        int statementCount = 0;
        for (i = 0; i < listSize - 2;  i++)
        {
            statementCount++;
            for (j = i+1; j <= listSize - 1; j++)
            {
                statementCount++;
                if (list[j] < list[i])
                    statementCount++;
                {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                    statementCount = statementCount + 3;
                }
            }
        }
        System.out.println();
        System.out.println("The number of statements executed was: " 
                + statementCount + ".");
        System.out.println();
        
        for (i = 0; i <= listSize-1; i++)
        {
             System.out.print(list[i] + " ");
        }
        System.out.println();               
    }
}

