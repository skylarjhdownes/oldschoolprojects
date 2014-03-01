
/**
 * Skylar Downes
 * 2/13/12
 */
public class Patient
{
    private int id;
    private int priority;
    

    /**
     * Constructor for objects of class Patient
     */
    public Patient(int in_id, int in_priority)
    {
        id = in_id;
        priority = in_priority;
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
