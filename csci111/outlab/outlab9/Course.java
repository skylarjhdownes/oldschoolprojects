import java.util.*;
/*
 * @author Skylar Downes
 * @version 11/7/11
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String name;
    private Student[] studentArr;
    private int numStudents;
    double largest = Integer.MIN_VALUE;
    double largest2 = Integer.MIN_VALUE;
    public Course(String in_name, int in_numStudents)
    {
        name = in_name;
        numStudents = in_numStudents;
        studentArr = new Student[numStudents];

    }
   

    public void enterValues()
    {
       Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < numStudents; i++)
        {
            System.out.println("enter the name and gpa of student " + i);
            String newName = in.next();
            double newGPA = in.nextDouble();
            if (newGPA <= 4.0 && newGPA >= 0.0)
            {
                studentArr [i] = new Student(newName, newGPA);
            }
            else
            {
                while (newGPA > 4.0 || newGPA < 0.0)
                {
                System.out.println("please enter a correct gpa for student " + i);
                newGPA = in.nextDouble();
                }
                studentArr [i] = new Student(newName, newGPA);
            }
        }
        
    }
    
    public String highQuiz()
    {
        int temp = 0;
        for (int i = 0; i < studentArr.length; i++)
        {
            if (studentArr[i].quizTotal() > largest)
            {
            largest = studentArr[i].quizTotal();
            temp = i;
            }
        }
        return studentArr[temp].getName();
    }
    public String highGPA()
    {

        int temp = 0;
        for (int i = 0; i < studentArr.length; i++)
        {
            if (studentArr[i].getGPA() > largest2)
            {
            largest2 = studentArr[i].getGPA();
            temp = i;
            }
        }
        return studentArr[temp].getName();
    }
    public int quizByName(String searchName)
    {
        for (int i = 0; i < studentArr.length; i++)
        {
        if(studentArr[i].getName().equals(searchName))
        return(studentArr[i].quizTotal());
        }
        return 0;
    }
       public Double gpaByName(String searchName)
    {
        for (int i = 0; i < studentArr.length; i++)
        {
        if(studentArr[i].getName().equals(searchName))
        return (studentArr[i].getGPA());
        }
        return 2.0;
    }
    public void printValues()
    {
        String one = "name";
        String two = "GPA";
        String three = "Total";
        System.out.printf("Students in course %s:%n", name);
        System.out.printf("%-9s%4s%8s%n", one, two, three);
        for (int i = 0; i < numStudents; i++)
        {
            System.out.printf("%-9s %4.1f%4d%n", studentArr[i].getName(), studentArr[i].getGPA(), studentArr[i].quizTotal());
        }
        System.out.printf("%s has the highest quiz total: %.1f%n", highQuiz(), largest);
        System.out.printf("%s has the highest GPA: %.1f%n", highGPA(), largest2);
    }
}
