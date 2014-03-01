
/**
 * A main program to test the Student class
 * 
 * @author Skylar Downes
 * @version 9/6/11
 */
public class mainclass
{
   public static void main()
    {
        // create three student objects/instances
        Student fred = new Student("Fred Smith", 82),
                jane = new Student("Jane Jones", 91),
                john = new Student("John Adams", 45);
        // test the status() method on the three Student instances
        fred.status();
        jane.status();
        john.status();
       
    }

}
