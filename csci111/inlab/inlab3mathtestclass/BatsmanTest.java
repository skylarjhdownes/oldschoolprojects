

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BatsmanTest.
 *
 * @author  Skylar Downes  
 * @version 9/20/11
 */

public class BatsmanTest extends junit.framework.TestCase
{
    public static void testBatsman()
    { Batsman chinBat = new Batsman("Graeme Swann", 36, 40, 6, 
                              800, 979),
            broadyBat = new Batsman("Stuart Broad", 41, 53, 7,
                                    1335, 2101);
     assertEquals(chinBat.average(), 23.52);
     assertEquals(chinBat.scoringRate(), 87.17);
     assertEquals(chinBat.getMatches(), 36);
     assertEquals(chinBat.getName(), "Graeme Swann");
     
     assertEquals(broadyBat.average(), 29.02);
     assertEquals(broadyBat.scoringRate(), 63.54);
     assertEquals(broadyBat.getMatches(), 41);
     assertEquals(broadyBat.getName(), "Stuart Broad");
    }
}