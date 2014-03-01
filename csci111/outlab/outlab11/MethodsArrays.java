
/**
 * @author Skylar Downes
 * @version 11/21/11
 */
public class MethodsArrays
{
    public static void print1DArr(int[] myArr1D)//prints out the values in the 1D array on one line separated by single spaces, followed by a new line
    {
        for (int i = 0; i < myArr1D.length; i++)
        {
            System.out.print(myArr1D[i] + " ");
        }
        System.out.println();
    }
    
    static void print2DArr1(int[][] myArr2D)//prints out the values in the 2D array with the values in each row on separate lines and values in each line separated by single spaces
    {
        for (int row = 0; row < myArr2D.length; row++)
        {
            for (int col = 0; col < myArr2D[row].length; col++)
            {
                System.out.print(myArr2D[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    public static void print2DArr2(int[][] myArr2D)
    {
        for (int i = 0; i < myArr2D.length; i++)
        {
        print1DArr(myArr2D[i]);
        }
    }
    
    public static int[] getRow(int[][] myArr2D, int rowNum)//returns a 1D array that is a specified row of the 2D array
    {
        int[] empty = {};
        int[] local = new int[myArr2D[0].length];
        if (rowNum >= myArr2D.length || rowNum < 0)
        {
            System.out.println("illegal rowNum value");
            return empty;
        }

        for (int i = 0; i < myArr2D[rowNum].length; i++)
        {
            local[i] = myArr2D[rowNum][i];
        }
        return local;
    }
    
    public static int[] getColumn(int[][] myArr2D, int colNum)// returns a 1D array that is the specified column of the 2D array
    {
        int[] empty = {};
        int[] local = new int[myArr2D.length];
        if  (colNum < 0)
        {
            System.out.println("illegal colNum value");
            return  empty;
        }
    
        for (int i = 0; i < myArr2D.length; i++)
        {
            if (colNum >= myArr2D[i].length)
            {
               System.out.println("illegal colNum value");
               return  empty;
            }
            local[i] = myArr2D[i][colNum];
        }
        return local;

    }
    
    public static boolean isRect(int [][] myArr2D)
    {
        boolean thing = true;
        for (int i = 0; i < myArr2D.length; i++)
        {
            if (myArr2D[i].length != myArr2D[0].length)
            {
                thing = false;
            }
        }
        return thing;
    }
    
    public static int dotProduct(int[] arr1, int[] arr2)
    {
        int sum = 0;
        if (arr1.length == arr2.length)
        {
        for (int i = 0; i < arr1.length; i++)
        {
            sum += (arr1[i] * arr2[i]);
        }
        }
        else
        {
            System.out.println("dot product arrays do not match");
            return Integer.MAX_VALUE;
        }
        return sum;
    }
    
    public static int[][] matrixMult(int[][] matA, int[][] matB)
    {
        if (isRect(matA) == false || isRect(matB) == false)
        {
            System.out.println("array is not a rectangle");
            return new int[0][0];
        }
        if (matA[0].length != matB.length)
        {
            System.out.println("dimensions don't match");
            return new int[0][0];
        }
        
        int [][] matC = new int[matA.length][matB[0].length];
        for (int i = 0; i < matC.length; i++)
        {
            for (int j = 0; j < matC[i].length; j++)
            {
                matC[i][j] = dotProduct(getRow(matA, i), getColumn(matB, j));
                
            }
        }
        return matC;
    }
}
