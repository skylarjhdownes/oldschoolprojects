import java.util.*;
/**
 * @author Skylar Downes
 * @version 11/7/11
 */
public class Student
{
    String name;
    double gpa;
    private int[] quizScores = new int[6];
    public Student(String in_name, double in_gpa)
    {
        name = in_name;
        gpa = in_gpa;
        getQuizzes();
    }
      private void getQuizzes()
    {
       Scanner in = new Scanner(System.in);
       System.out.println("please enter six quiz scores:");
       for (int i = 0; i < 6; i++)
       {
           quizScores[i] = in.nextInt();
                       if (quizScores[i] <= 20 && quizScores[i] >= 0)
            {
                
            }
            else
            {
                while (quizScores[i] > 20 || quizScores[i] < 0)
                {
                System.out.println("please enter a correct quiz score (0-20)");
                quizScores[i] = in.nextInt();
                }
            }
       }
    }
    String getName()
    {
        return name;
    }
    double getGPA()
    {
        return gpa;
    }
    public int quizTotal()
    {
        int total = 0;
        int lowest = Integer.MAX_VALUE;
       for (int i = 0; i < quizScores.length; i++)
       {
           total = (quizScores[i] + total);
           if (lowest > quizScores[i])
           lowest = quizScores[i];
       }
       total = (total - lowest);
       return total;
    }
    public int[] getQuizScores()
    {
        return quizScores;
    }
    public void setQuizScores(int[] in)
    {
        quizScores = in;
    }
}
