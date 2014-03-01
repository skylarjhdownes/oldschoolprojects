import java.util.*;
/**
 * outlab3
 * first program using stacks.
 * Skylar Downes
 * 2/13/12
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
       Queue queue = new Queue();
       Scanner in = new Scanner(System.in);
       boolean printing = false;
       boolean occupied = false;
       Patient ER;
       Patient newPatient;
       
       while(!done)
       {
           System.out.print("Enter 1 to enter a new patient ID number, 2 to send the next patient to the ER, \n3 to quit, 4 to turn on print status, and 5 to turn off print status: ");
           choice = in.nextInt();
           System.out.println();
           
           if (choice == 1)
           {
               if (occupied = false)
               {
                   System.out.print("Enter a patient ID and priority to push: ");
                   id = in.nextInt();
                   priority = in.nextInt();
                   while (priority > 4 || priority < 1)
                   {
                       System.out.println("Please enter a priority between 1 and 4");
                       priority = in.nextInt();
                   }
                   newPatient = new Patient(id, priority);
                   ER = newPatient;
                   occupied = true;
               }
               else
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
                        if (priority < 4)
                        {
                                stack.push(id, priority);
                                System.out.println();
                        }
                        else
                        {
                            if (queue.isFull() == false)
                            {
                                newPatient = new Patient(id, priority);
                                queue.enqueue(newPatient);
                                System.out.println();
                            }
                            else
                            {
                                System.out.print("Cannot enqueue, queue is full");
                                System.out.println();
                            }
                        }
                   }
               if (printing == true)
               {
                   stack.printStack();
                   queue.printQueue();
               }
            }
           }
           else if (choice == 2)
           {
               if (stack.isEmpty() == true)
               {
                   if (queue.isEmpty() == true)
                   {
                       System.out.println("Stack and queue are empty.");
                       System.out.println();
                       occupied = false;
                   }
                   else
                   {
                       patient = queue.dequeue();
                       System.out.println("The id # of the first patient in the queue was: " + patient.getId() + " and their priority was: " + patient.getPriority() + " this patient was sent to the ER\n");
                       System.out.println();
                   }
               }
               else
               {
                   patient = stack.pop();
                   System.out.println("The id # of the top patient on the stack was: " + patient.getId() + " and their priority was: " + patient.getPriority() + " this patient was sent to the ER\n");
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
