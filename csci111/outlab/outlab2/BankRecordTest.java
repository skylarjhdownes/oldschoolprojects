

/**
 * The test class BankRecordTest.
 *
 * @author  Skylar Downes
 * @version 9/19/11
 */
public class BankRecordTest extends junit.framework.TestCase
{    
    public static void testBankRecord()
    {
// First use the constructor with three parameters
BankRecord student = new BankRecord("John", "Smith", 120);
        
assertEquals(student.getBalance(), 120);
student.makeDeposit(60);      // deposit $60
student.makeWithdrawal(100);  // withdraw $100
assertEquals(student.getBalance(), 80);
        
assertEquals(student.getFirstName(), "John");
assertEquals(student.getLastName(), "Smith");
assertEquals(student.fullName(), "John Smith");
        
// Now use the constructor with two parameters
BankRecord graduate = new BankRecord("Alice", "Springs");
        
assertEquals(graduate.getBalance(), 0);
graduate.makeDeposit(6000);     // deposit $6000  
graduate.makeWithdrawal(5000);  // withdraw $5000
assertEquals(graduate.getBalance(), 1000);
        assertEquals(graduate.getFirstName(), "Alice");
assertEquals(graduate.getLastName(), "Springs");
assertEquals(graduate.fullName(), "Alice Springs");
    }
}
