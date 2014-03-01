

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AverageTimeTest.
 *
 * @author  Skylar Downes  
 * @version 10/4/11
 */
public class AverageTimeTest
{
    public static void testAverageTime()
    {
        Swimmer phelps = new Swimmer("Michael Phelps", 50.87, 50.97, 50.58),
            susan = new Swimmer("Susan Starkey", 60.0, 59.0),
            me  = new Swimmer("Denbigh Starkey", 250.9);
            
            assertEquals(phelps.averageTime(), 50.81, .1);
            assertEquals(susan.averageTime(), 59.50, .1);
            assertEquals(me.averageTime(), 250.9, .1);
    }
}
