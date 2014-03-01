
/**
 * class for testing MethodsArrays
 * @author Skylar Downes
 * @version 11/21/11
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
                         {1, 2, 3, 4}},
                arr3 = {{1, 2, -1},
                        {0, 2, 0},
                        {1, 1, 1},
                        {-1, -1, -1}};              

        MethodsArrays.print1DArr(MethodsArrays.getRow(arr1, 3));
        MethodsArrays.print1DArr(MethodsArrays.getColumn(arr2, 2));
        
        System.out.println(MethodsArrays.isRect(arr1));
        System.out.println(MethodsArrays.isRect(arr2));
        System.out.println();
        
        System.out.println(MethodsArrays.dotProduct(
                          MethodsArrays.getRow(arr1, 0),
                          MethodsArrays.getColumn(arr1, 0)));
        System.out.println();
        
        MethodsArrays.print2DArr2(MethodsArrays.matrixMult(arr1, arr3));
        System.out.println();
        MethodsArrays.print2DArr2(MethodsArrays.matrixMult(arr1, arr2));
    }
}