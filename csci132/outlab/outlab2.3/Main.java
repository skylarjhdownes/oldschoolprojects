import java.util.*;
/**
 * outlab1
 * first program using stacks.
 * Skylar Downes
 * 2/1/12
 */
public class Main
{
    public static void Main()
    {
       int choice;
       int id;
       int priority;
       int pushValue;
       Patient patient;
       Boolean done = false;
       Stack1 stack = new Stack1();
       Scanner in = new Scanner(System.in);
       boolean printing = false;
       
       while(!done)
       {
           System.out.print("Enter 1 to enter a new patient ID number, 2 to send the next patient on the stack to the ER, \n3 to quit, 4 to turn on print status, and 5 to turn off print status: ");
           choice = in.nextInt();
           System.out.println();
           
           if (choice == 1)
           {
               
               if (stack.isFull() == true)
               {
                   System.out.println("Stack is full. Cannot push.");
                   System.out.println();
               }
               else
               {
                System.out.print("Enter a patient ID and priority to push: ");
                id = in.nextInt();
                priority = in.nextInt();
                    while (priority > 4 || priority < 1)
                    {
                        System.out.println("Please enter a priority between 1 and 4");
                        priority = in.nextInt();
                    }

                stack.push(id, priority);
                System.out.println();
               }
               if (printing == true)
               {
                   stack.printStack();
               }
           }
           else if (choice == 2)
           {
               if (stack.isEmpty() == true)
               {
               System.out.println("Stack is empty. Nothing there to pop.");
               System.out.println();
               }
               else
               {
               patient = stack.pop();
               System.out.println("The id # of the top patient on the stack was: " + patient.getId() + " and their priority was: " + patient.getPriority());
               System.out.println();
               }
           }
           else if (choice == 3)
           {
               done = true;
           }
           else if (choice == 4)
           {
               printing = true;
           }
           else if (choice == 5)
           {
               printing = false;
           }
           else
           {
               System.out.println("The number you entered, '" + choice + "', is not 1, 2, 3, 4 or 5. Please try again.");
               System.out.println();
           }
           
    }
    }
}
