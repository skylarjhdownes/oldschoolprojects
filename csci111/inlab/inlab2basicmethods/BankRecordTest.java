

/**
 * The test class BankRecordTest.
 *
 * @author  Skylar Downes
 * @version 9/13/11
 */
public class BankRecordTest extends junit.framework.TestCase
{    
    public static void testBankRecord()
    {BankRecord student = new BankRecord("John", "Smith", 120);
        
        assertEquals(student.getBalance(), 120);
        student.makeDeposit(60);
        assertEquals(student.getBalance(), "John");
        
        assertEquals(student.getFirstName(), "John");
        assertEquals(student.getLastName(), "Smith");
    }
}
