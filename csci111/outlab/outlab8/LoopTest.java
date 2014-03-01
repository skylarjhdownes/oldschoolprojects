import java.util.*;
import javax.swing.*;
/**
 * @author Skylar Downes
 * @version 10/31/11
 */
public class LoopTest
{
    // instance variables - replace the example below with your own
    static int numPeople;
    static int person = 1;
    static String firstName;
    static String lastName;
    static int heightEntry;
    static String height;
    static String daughterName;
    public static void personInfo()
    {
        JOptionPane outPane = new JOptionPane();
        Scanner in = new Scanner(System.in);
        
       while (person != 5)
       {
            System.out.format("Enter the first and last names and the height for person %d. to end enter done.%n", person);
            firstName = in.next();
            if (firstName .equals("done"))
            {
                person = 5;
            }
            else
            {
                lastName = in.next();
                heightEntry = in.nextInt();
                height = (heightEntry / 12) + " feet " + (heightEntry % 12) + " inches";
                System.out.format("Enter his/her daughters name in any form on one line:%n");
                daughterName = in.next();
                outPane.showMessageDialog(null, firstName + " " + lastName + " is " + height + " tall.");
                outPane.showMessageDialog(null, "his/her daughter is " + daughterName);
            }
       }
    }
    public static void forTest(int n)
    {
        JOptionPane outPane = new JOptionPane();
        Scanner in = new Scanner(System.in);
        
        String stringThing = "The average of ";
        double number;
        double total = 0;
        if (n <= 0)
        {
                outPane.showMessageDialog(null, "NO");
        }
        else
        {
        for (int i = 0; i < n; i++)
        {
            number = in.nextDouble();
            stringThing += String.format("%.2f",number) + ", ";
            total += number;
        }
        outPane.showMessageDialog(null, stringThing + "is " + String.format("%.2f",total / n));
    }
    }
    public static double whileTest()
    {
        JOptionPane outPane = new JOptionPane();
        Scanner in = new Scanner(System.in);
        
        double number = 0;
        double largest = -1;
        
        while (number != -1)
        {
            number = in.nextDouble();
            if (number > largest)
            {
                largest = number;
            }
        }
        if (largest == -1)
        {
            System.out.print("NO");
            return 0.0;
        }
        return largest;
    }
    public static IntIntDouble doWhileTest()
    {
        JOptionPane outPane = new JOptionPane();
        Scanner in = new Scanner(System.in);
        int number;
        int int1 = Integer.MIN_VALUE;
        int int2 = Integer.MAX_VALUE;
        double double1 = 0.0;
        int counter = 0;
        double total = 0;
        do 
        {
            number = in.nextInt();
            counter ++;
            total += number;
            if (number > int1 && number != -1)
            {
                int1 = number;
            }
            if (number < int2 && number != -1)
            {
                int2 = number;
            }
        } while (number != -1);
        double1 = (total + 1.0) / (counter - 1);
        if (int1 <= 0)
        {
            System.out.print("NO");
            int1 = 0;
            int2 = 0;
            double1 = 0;
        }
            return new IntIntDouble(int1, int2, double1);
    }
}