
/**
 * Write a description of class MainTest here.
 * 
 * @author Skylar Downes
 * @version 9/19/11
 */
public class MainTest

{
    public static void main()
    {
        // Uses both constructors
        BankRecord student = new BankRecord("John", "Smith", 120);
        BankRecord graduate = new BankRecord("Alice", "Springs");
        
        student.makeDeposit(60);        // deposit $60
        student.makeWithdrawal(100);    // withdraw $100
        student.printBalance();
    
        graduate.makeDeposit(6000);     // deposit $6000  
        graduate.makeWithdrawal(5000);  // withdraw $5000
        graduate.printBalance();
    }
}
