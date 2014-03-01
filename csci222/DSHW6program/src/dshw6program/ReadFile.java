
package dshw6program;

import java.io.FileReader;
import java.util.*;

public class ReadFile {
    
public static int[][] RArray;

    public static int[][] read() {
        boolean readIt = readFile("test.txt");
        if (readIt) {
            System.out.println("read file successfully");
        }
        return RArray;
    }

    public static boolean readFile(String fileName) {
        try {
            Scanner scanner = new Scanner(new FileReader(fileName));
            String line;
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                if (lineNum == 0){
                    int thing = scanner.nextInt();
                    RArray = new int[thing][thing];
                    lineNum++;
                    line = scanner.nextLine();
                }
                else {
                    line = scanner.nextLine();
                    Scanner lineScanner = new Scanner(line);
                    lineScanner.useDelimiter(" ");
                    System.out.print("line " + lineNum + " ints : ");
                    int count = 0;
                    while (lineScanner.hasNextInt()) {
                        int intValue = lineScanner.nextInt();      
                        RArray[lineNum-1][count] = intValue;
                        System.out.print(" " + intValue);
                        count++;
                    }
                    System.out.println();
                    lineNum++;
                }
            }
            scanner.close();
            
            return true; // success
        } catch (Exception e) {
            System.out.println(e);
        }
        return false; // failure
    }
}
