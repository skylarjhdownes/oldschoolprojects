import java.util.*;
/**
 * 
 * @author Skylar Downes
 * @version 10/24/11
 */

public class MainTest
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        

 System.out.println("Please enter name (first, last) and GID for 7 people");
GID john = new GID(in.next() + " " + in.next(), in.next()); 
GID ro = new GID(in.next() + " " + in.next(), in.next());
GID jack = new GID(in.next() + " " + in.next(), in.next()); 
GID bil = new GID(in.next() + " " + in.next(), in.next());
GID mick = new GID(in.next() + " " + in.next(), in.next()); 
GID mum = new GID(in.next() + " " + in.next(), in.next()); 
GID susan = new GID(in.next() + " " + in.next(), in.next());
   
System.out.format("%n%s has the biggest GID  (%s)%n", 
                   GID.maxName(), GID.maxGID());
 System.out.format("%n%s has the smallest GID  (%s)%n", 
                   GID.minName(), GID.minGID());
    }
}
 

