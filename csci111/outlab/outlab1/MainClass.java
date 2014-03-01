
/**
 * Swimmer Class Program
 * 
 * @author Skylar Downes
 * @version 9/12/11
 */
public class MainClass
{
    public static void main()
    {
        // create the two Swimmer objects
        Swimmer phelps = new Swimmer("Michael Phelps", 50.87, 50.97, 50.58),
                cavic = new Swimmer("Milorad Cavic", 50.76, 50.92, 50.59);
                
        // test the Swimmer methods on phelps and cavic
        System.out.println(phelps.getName());
        System.out.printf("Total time: %.2f\n", phelps.totalTime());
        System.out.printf("Average time 1: %.2f\n", phelps.averageTime1());
        System.out.printf("Average time 2: %.2f\n", phelps.averageTime2());
        System.out.printf("Finals time: %.2f\n", phelps.getFinals());
        
        System.out.println(); // used to get a blank line
        System.out.println(cavic.getName());
        System.out.println("Total time: " + cavic.totalTime());
        System.out.println("Average time 1: " + cavic.averageTime1());
        System.out.println("Average time 2: " + cavic.averageTime2());
        System.out.println("Finals time: " + cavic.getFinals());
    }
}
