
package inlab13;
import java.util.*;
import java.io.*;

public class Inlab13{
    // This program will print the functional values of n^2 and nlogn for
    // comparison and plotting.
   public static void main(String[] args){
       
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the starting value for n for this comparison: ");
        int startValue = keyboard.nextInt();
        System.out.println();
        System.out.print("Enter ending value for n for this comparison: ");
        int endValue = keyboard.nextInt();
        System.out.println();
        
        try{        
            // Open a new file for recording the functional results
            PrintWriter resultsFile = 
 new PrintWriter(new FileWriter("Files/ntimesnAndnlogn.csv"));
            
            resultsFile.print("Skylar, Downes");
            resultsFile.println();       
            
            resultsFile.print("function, one");
            resultsFile.println();    
            
            int n = startValue;
            while (n <= endValue){
                resultsFile.print(n*n);
 resultsFile.print(",");
                n++;
            }
            resultsFile.println();
            
            resultsFile.print("function, two");
            resultsFile.println();  
            
            n = startValue;
            while (n <= endValue){
                int temp = n;
                //calculate log2n
                int log2 = 0;
                while (temp > 0){
                    temp = temp/2;
                    log2 = log2 + 1;
                }
                resultsFile.print(n*log2);
                resultsFile.print(",");
                log2 = 0;
                n++;
            }
            resultsFile.println();
            
            resultsFile.close();
        }
        catch (IOException ex) {
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }
}