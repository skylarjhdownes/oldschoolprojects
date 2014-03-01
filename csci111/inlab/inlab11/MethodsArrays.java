
/**
 * @author Skylar Downes
 * @version 11/15/11
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
    
    public static int[] getRow(int[][] myArr2D, int rowNum)//returns a 1D array that is a specified row of the 2D array
    {
        int[] local = new int[myArr2D[rowNum].length];
        if (rowNum > myArr2D[rowNum].length || rowNum < 0)
        {
            System.out.println("illegal rowNum value")
            return
        }
        else
        {
            for (int i = 0; i < myArr2D[rowNum].length; i++)
            {
                local[i] = myArr2D[rowNum][i];
            }
            return local;
        }
    }
    
    public static int[] getColumn(int[][] myArr2D, int colNum)// returns a 1D array that is the specified column of the 2D array
    {
        int[] local = new int[myArr2D.length];
        for (int i = 0; i < myArr2D.length; i++)
        {
            local[i] = myArr2D[i][colNum];
        }
        return local;
    }
}
