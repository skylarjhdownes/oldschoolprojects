
/**
 * Tests the program
 * 
 * @author Skylar Downes 
 * @version 10/11/11
 */
public class MainTest
{
    public static void main()
    {
        VariousMethods.dates2(18);
        VariousMethods.dates1(80);
        VariousMethods.dates2(62);
        VariousMethods.dates2(60);
        VariousMethods.dates2(20);
        VariousMethods.dates1(-6734);
        System.out.println();
        System.out.println("Max of 3, 8, 2, 7, 8, 9 is: " + VariousMethods.maxOf6(3, 8, 2, 7, 8, 9));
        System.out.println("Max of 1, 2, 3, 4, 5, 6 is: " + VariousMethods.maxOf6(1, 2, 3, 4, 5, 6));
        System.out.println("Max of 6, 5, 4, 3, 2, 1 is: " + VariousMethods.maxOf6(6, 5, 4, 3, 2, 1));
        System.out.println("Max of 3, 3, 3, 3, 3, 3 is: " + VariousMethods.maxOf6(3, 3, 3, 3, 3, 3));
        System.out.println("Max of-1, -2, -3, -4, -5, -6 is: " + VariousMethods.maxOf6(-1,-2,-3,-4,-5,-6));
        VariousMethods.sort6(3, 8, 2, 5, 7, 5);
        VariousMethods.sort6(-8, -7, -6, -5, -4, -3);
        VariousMethods.sort6(-3, -2, -1, 0, 1, 2);
        VariousMethods.sort6(2, 1, 0, -1, -2, -3);
        VariousMethods.sort6(0, 0, 0, 0, 0, 0);
    }
}
