import java.util.*;
/**
 * @author Skylar Downes
 * @version 12/6/11
 */
public class HandleExceptions
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int entry = 0;
        boolean badInput = true;
        System.out.println("Enter an odd positive int:");
        while (badInput)
        {
            try
            {
                entry = in.nextInt();
                if (entry < 0)
                {
                    throw new IndexOutOfBoundsException();
                }
                if ((entry % 2) == 0)
                {
                    throw new CantBeEvenException();
                }
                badInput = false;
                System.out.printf("entry: %s%n", entry);
            }
            catch (InputMismatchException exception)
            {
                String badValue = in.next();
                System.out.println("Not an int, try again");
            }
            catch (IndexOutOfBoundsException exception)
            {
                System.out.println("Not a positive number, try again");
            }
            catch (CantBeEvenException exception)
            {
                System.out.println("Not an odd number, try again");
            }
        }
    }
}
