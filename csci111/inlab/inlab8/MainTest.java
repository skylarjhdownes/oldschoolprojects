import java.util.*;
import javax.swing.*;
/**
 * Write a description of class MainTest here.
 * 
 * @author Skylar Downes
 * @version 10/25/11
 */
public class MainTest
{
    // instance variables - replace the example below with your own
    static int numPeople;
    static int person = 1;
    static String firstName;
    static String lastName;
    static int heightEntry;
    static String height;
    static String daughterName;
    public static void main()
    {
        JOptionPane outPane = new JOptionPane();
        System.out.println("Enter the number of people");
        Scanner in = new Scanner(System.in);
        int numPeople = in.nextInt();

       for (int person = 0; person <= numPeople; person++)
       {
            System.out.format("Enter the first and last names and the height for person %d%n", person);
            firstName = in.next();
            lastName = in.next();
            heightEntry = in.nextInt();
            height = (heightEntry / 12) + " feet " + (heightEntry % 12) + " inches";
            System.out.format("Enter his/her daughters name in any form on one line:%n");
            daughterName = in.next();
            outPane.showMessageDialog(null, firstName + " " + lastName + " is " + height + " tall.");
            outPane.showMessageDialog(null, "his/her daughter is " + daughterName);
        }
    }
    public static void main2()
    {
        JOptionPane outPane = new JOptionPane();
        System.out.println("Enter the number of people");
        Scanner in = new Scanner(System.in);
        int numPeople = in.nextInt();

       while (person <= numPeople)
       {
            System.out.format("Enter the first and last names and the height for person %d%n", person);
            firstName = in.next();
            lastName = in.next();
            heightEntry = in.nextInt();
            height = (heightEntry / 12) + " feet " + (heightEntry % 12) + " inches";
            System.out.format("Enter his/her daughters name in any form on one line:%n");
            daughterName = in.next();
            outPane.showMessageDialog(null, firstName + " " + lastName + " is " + height + " tall.");
            outPane.showMessageDialog(null, "his/her daughter is " + daughterName);
            person++;
        }
    }
}