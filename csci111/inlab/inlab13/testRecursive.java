
/**
 * Write a description of class testRecursive here.
 * 
 * @author Skylar Downes
 * @version 11/29/11
 */
public class testRecursive
{
    public static void print1DArr(int[] myArr)
    {
        for (int i = 0; i < myArr.length; i++)
            System.out.format("%d ", myArr[i]);
        System.out.println();
    }
    
    public static void main()
    {
        int[] test1 = {3, 1, 5, 2, 4, 6, 8, 7},
              test2 = {-2, -2, -2, -2},
              test3 = {-4, -3, -2, -1, 0, 1, 2, 3},
              test4 = {3, 2, 1, 0},
              test5 = {0};
              
       System.out.print("Array:     ");
        print1DArr(test1);
        System.out.format("Min value: %d%n%n", Recursive.minArray(test1));
        
        System.out.print("Array:     ");
        print1DArr(test2);
        System.out.format("Min value: %d%n%n", Recursive.minArray(test2));
        
        System.out.print("Array:     ");
        print1DArr(test3);
        System.out.format("Min value: %d%n%n", Recursive.minArray(test3));
        
        System.out.print("Array:     ");
        print1DArr(test4);
        System.out.format("Min value: %d%n%n", Recursive.minArray(test4));
        
        System.out.print("Array:     ");
        print1DArr(test5);
        System.out.format("Min value: %d%n", Recursive.minArray(test5));  
        
        System.out.println();
        
        System.out.print("Original: ");
        print1DArr(test1);
        System.out.print("Sorted:   ");
        print1DArr(Recursive.sort(test1));
        System.out.println();
        
        System.out.print("Original: ");
        print1DArr(test2);
        System.out.print("Sorted:   ");
        print1DArr(Recursive.sort(test2));
        System.out.println();
        
        System.out.print("Original: ");
        print1DArr(test3);
        System.out.print("Sorted:   ");
        print1DArr(Recursive.sort(test3));
        System.out.println();
        
        System.out.print("Original: ");
        print1DArr(test4);
        System.out.print("Sorted:   ");
        print1DArr(Recursive.sort(test4));
        System.out.println();
        
        System.out.print("Original: ");
        print1DArr(test5);
        System.out.print("Sorted:   ");
        print1DArr(Recursive.sort(test5));
    }       
}
