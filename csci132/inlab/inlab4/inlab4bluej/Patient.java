
/**
 * Skylar Downes
 * 2/7/12
 */
public class Patient
{
    private String firstName;
    private String lastName;
    private int age;
    private int id;
    private int priority;
    

    /**
     * Constructor for objects of class Patient
     */
    public Patient(String in_firstName, String in_lastName, int in_age, int in_id, int in_priority)
    {
        firstName = in_firstName;
        lastName = in_lastName;
        age = in_age;
        id = in_id;
        priority = in_priority;
    }
        
    public String getFirstName()
    {
        return firstName;
    }
   
    public String getLastName()
    {
        return lastName;
    }
    
        public int getAge()
    {
        return age;
    }
    
    public int getId()
    {
        return id;
    }
   
    public int getPriority()
    {
        return priority;
    }
}