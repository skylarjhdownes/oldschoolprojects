/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readtext;

import java.io.FileReader;
import java.util.*;

/**
 *
 * @author bmumey
 */
public class ReadText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean readIt = readFile("test.txt");
        if (readIt) {
            System.out.println("read file successfully");
        }
    }

    public static boolean readFile(String fileName) {
        try {
            Scanner scanner = new Scanner(new FileReader(fileName));

            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(" ");
                System.out.print("line " + lineNum + " ints : ");
                while (lineScanner.hasNextInt()) {
                    int intValue = lineScanner.nextInt();
                    System.out.print(" " + intValue);
                }
                System.out.println();
                lineNum++;
            }
            scanner.close();

            return true; // success
        } catch (Exception e) {
            System.out.println(e);
        }
        return false; // failure
    }
}
