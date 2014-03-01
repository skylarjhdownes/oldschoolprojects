

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Write a description of class VariousMethods here.
 * 
 * @author Skylar Downes 
 * @version 10/11/11
 */
public class TestVariousMethods
{
    public static void testvariousMethods()
    {
        assertEquals( VariousMethods.maxOf6(3, 8, 2, 7, 8, 9), 9);
        assertEquals( VariousMethods.maxOf6(1, 2, 3, 4, 5, 6), 6);
        assertEquals( VariousMethods.maxOf6(6, 5, 4, 3, 2, 1), 6);
        assertEquals( VariousMethods.maxOf6(3, 3, 3, 3, 3, 3), 3);
    }
}
