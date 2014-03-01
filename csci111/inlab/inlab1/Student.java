
/**
 * A simple student record with name and score
 * 
 * @author Skylar Downes
 * @version 9/6/11
 */
public class Student
{
    // instance variables
    private String name;
    private int score;

    /**
     * Constructor for objects of class Student
     */
    public Student(String in_name, int in_score)
    {
        name = in_name;
        score = in_score;
    }

    /**
     * Outputs whether the student is passint or failing the course
     * based on whether their current score is at least 60
     *
     */
    public void status()
    {
       if (score >= 60)
            System.out.println(name + " is passing");
       else
            System.out.println(name + " is failing");
    }
}
