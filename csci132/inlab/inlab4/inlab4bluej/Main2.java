import java.util.Scanner;
// class Main is intended for no other purpose than to test class Queue1
public class Main2
{
    public static void main()
    {
       int choice;
       Patient enqueueValue;
       Patient dequeueValue;
       Patient pushValue;
       Boolean done = false;
       Queue2 queue = new Queue2();
       Scanner keyboard = new Scanner(System.in);
       
       // This while loop continuously executes a loop that allows the user to test class Queue1.
       // It is an example of how a class can be tested prior to its use in a real program.
       while (!done) 
       {
            // Each time the loop starts, the user is presented with a menu with items for exercising
            // each method of clsss Queue1, in this case, enqueue, dequeue, isEmpty and isFull. There 
            // is also a menu item for terminating the loop.
            System.out.print("Enter 1 to enqueue, 2 to dequeue, 3 to push, and 4 to quit: ");
            choice = keyboard.nextInt();
            System.out.println();
            
            //This switch statement selects the proper case for the menu choice made by the user.
            switch (choice)
            {
               case 1: // Exercise the enqueue method of class Queue2
                    if (queue.isFull())
                    {
                        System.out.println("Cannot enqueue, queue is full! ");
                    }
                    else
                    {     
                        System.out.print("Enter an patient's data to enqueue: ");
                        enqueueValue = new Patient(keyboard.next(), keyboard.next(), keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt()); // keyboard.next();
                        queue.enqueue(enqueueValue);
                        System.out.println();
                    }
                    break;
               case 2: // Exercise the dequeue method of class Queue2
                    if (queue.isEmpty())
                    {
                        System.out.println("Cannot dequeue, queue is empty! ");
                    }
                    else
                    {
                        dequeueValue = queue.dequeue();
                        System.out.println("The first patient in the queue was " + dequeueValue.getFirstName() + " " + dequeueValue.getLastName() + ", who is " +  dequeueValue.getAge() + " years old, \nhas ID number " + dequeueValue.getId() + ", and priority " +  dequeueValue.getPriority());   
                        System.out.println();
                    }
                    break;
               case 3:
                    if (queue.isFull())
                    {
                        System.out.println("Cannot push, queue is full! ");
                    }
                    else
                    {     
                        System.out.print("Enter an patient's data to push: ");
                        pushValue = new Patient(keyboard.next(), keyboard.next(), keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt()); // keyboard.next();
                        queue.push(pushValue);
                        System.out.println();
                    }
                    break;
               case 4: // Set done to true so that the loop will end
                    done = true;
                    break;
               default: 
                    // This default clause handles the case that the user has typed in an integer
                    // that is not one of the valid choices
                    System.out.println("The number you entered, "+ choice + ", + is not 1, 2, 3, or 4. Try again!");
                    System.out.println();
                    break;
            }
       }
       System.out.println("...quitting");
    }
}