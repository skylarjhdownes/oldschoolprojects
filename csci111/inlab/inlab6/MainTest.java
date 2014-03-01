
/**
 * Write a description of class VariousMethods here.
 * 
 * @author Skylar Downes 
 * @version 10/11/11
 */
public class MainTest
{
    public int main(int y)
    {
        VariousMethods.dates2(18);
        VariousMethods.dates1(80);
        VariousMethods.dates2(62);
        VariousMethods.dates2(60);
        VariousMethods.dates2(20);
        System.out.println();
        System.out.println("Max of 3, 8, 2, 7, 8, 9 is: " + VariousMethods.maxOf6(3, 8, 2, 7, 8, 9));
        System.out.println("Max of 1, 2, 3, 4, 5, 6 is: " + VariousMethods.maxOf6(1, 2, 3, 4, 5, 6));
        System.out.println("Max of 6, 5, 4, 3, 2, 1 is: " + VariousMethods.maxOf6(6, 5, 4, 3, 2, 1));
        System.out.println("Max of 3, 3, 3, 3, 3, 3 is: " + VariousMethods.maxOf6(3, 3, 3, 3, 3, 3));
        return 5;
    }
}
