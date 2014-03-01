

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SummaryTest.
 *
 * @author  Skylar Downes  
 * @version 10/4/11
 */
public class SummaryTest
{
    public static void testSummary()
    {
        final double tolerance = 1.0e-10;
        Summary testit = new Summary("Joe Smith", 55.3, 58.224);
        assertEquals(testit.getName(), "Joe Smith");
        assertEquals(testit.getDoub1(), 55.3, tolerance);
        assertEquals(testit.getDoub2(), 58.224, tolerance);
    }
}