
/**
 * 
 * @author Skylar Downes 
 * @version 09/13/11
 */
public class BankRecord
{
    private String firstName; // The account holders first name
    private String lastName; // The account holders last name
    private int balance; // the balance in the account

    /**
     * Constructor for objects of class BankRecord
     */
    public BankRecord(String in_firstName, String in_lastName, int in_balance)
    {
       firstName = in_firstName;
       lastName = in_lastName;
       balance = in_balance;
    }

    /**
     * outputs a name, the original balance of the account, and the final balance of the account
     */
    public String getFirstName() // returns the first name
    {return firstName;
    }
    public String getLastName() // returns the last name
    {return lastName;
    }
    public int getBalance() // returns the current account balance
    {return balance;
    }
    public void makeDeposit(int deposit) // adds together the current value of balance and deposit
    {balance += deposit;
    }
    public String fullName() // Returns the first and last name
    {return firstName + " " + lastName;
    }
    public void makeWithdrawal(int withdrawal) // subtracts the withdrawal from the balance
    {balance -= withdrawal;
    } 
    public void printBalance() //prints the current account balance
    {System.out.println(firstName + lastName + "'s current balance is $" + balance);
    }
}
