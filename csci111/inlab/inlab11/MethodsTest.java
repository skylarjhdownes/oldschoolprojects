
/**
 * class for testing MethodsArrays
 * @author Skylar Downes
 * @version 11/15/11
 */
public class MethodsTest
{
    public static void main()
    {
        int[][] arr1 = {{1, 3, 2, 0},
                         {0, -1, -2, -3},
                         {1, 2, 3, 4}},
                arr2 = {{6, 3, -1, 2},
                         {4},
                         {2, -1, 3},
                         {1, 2, 3, 4}};
                         
        MethodsArrays.print2DArr1(arr1);
        System.out.println();
        
        MethodsArrays.print2DArr1(arr2);        System.out.println();
        MethodsArrays.print1DArr(MethodsArrays.getRow(arr1, 2));
        System.out.println();
        
        MethodsArrays.print1DArr(MethodsArrays.getRow(arr2, 2));
        System.out.println();
        
        MethodsArrays.print1DArr(MethodsArrays.getColumn(arr1, 2));
        System.out.println();
        
        MethodsArrays.print1DArr(MethodsArrays.getColumn(arr2, 0));
        System.out.println();
    }
}