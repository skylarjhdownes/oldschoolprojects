
package stacklinkedlist;

import java.util.*;

/**
 *
 * @author rockyross
 */

    class Patient{
        // Instance variables for Patient objects
        private int id, priority;

        // Constructor for patient objects
        public Patient(int idNumber, int priorityNumber){
            id = idNumber;
            priority = priorityNumber;
        }

        public int getId(){
            return id;
        }

        public int getPriority(){
            return priority;
        }
    }

    class StackLinked{
        
        // StackNode is a private static  subclass contained in class 
        // StackLinked. "Private" means that this class is only visible inside
        // class StackLinked. This is purposefully done, because class
        // StackLinked manages a linked list of StackNode objects, and only
        // StackLinked needs to be aware of the type of nodes (StackNodes)
        // that it uses for the linked list.
        // This is a common approach for managing linked lists of all types.
        // The objective of a linked list is to hold objects of some type in
        // a flexible linked data structure. Thus, the nodes in the linked
        // structure must have (pointers to) objects of the type being stored
        // plus a link (pointer to) other nodes. Thus a node is made up of
        // a (pointer to) an object and one or more added fields that are
        // serve as pointers to other nodes of this type. This is what class
        // StackNode does. It consists of a Patient object pointer variable
        // called "patient" and one more variable called "nextNode" that can
        // point to other StackNodes.
        private static class StackNode{
            //instance variables
            Patient patient;
            StackNode nextNode;

            // Constructor for objects of class StackNode
            StackNode(Patient newPatient){
                patient = newPatient;
            }
        }

        // Instance variable for class StackLinked
        StackNode top = null;
        
        public void push(Patient newPatient){
            StackNode newNode = new StackNode(newPatient);
            if (top == null){
                top = newNode;
                top.nextNode = null;
            }
            else{
                newNode.nextNode = top;
                top = newNode;
            }
        }

        public Patient pop(){
            Patient returnedPatient;
            // ASSERT top points to the first free element on top of the stack
            returnedPatient = top.patient;
            top = top.nextNode;
            return(returnedPatient);                
        }

        public Boolean isEmpty(){
            if (top == null)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
        public void print(){
            if (top == null){
                System.out.println("The stack is empty!");
                System.out.println();
            }
            else {
                StackNode temp = top;
                System.out.println("Current stack contents");
                System.out.println();
                while (temp != null) {
                    System.out.println("     " + temp.patient.getId() + " " 
                        + temp.patient.getPriority());
                    temp = temp.nextNode;
                }
                System.out.println();                
            }
        }
    }

    class StackLinkedList{
        /**
        * @param args the command line arguments
        */
        public static void main(String[] args) {
            int choice, id, priority;
            Patient patient;
            Boolean done = false;
            Outlab6 stack = new Outlab6();
            Scanner keyboard = new Scanner(System.in);

            // This while statement continuously executes a loop that allows the
            // user to continuously test the stak implementation.
            // It is an example of how a class can be tested prior to its use in
            // a real program.
            while (!done) 
            {
                // Each time the loop starts, the user is presented with a menu with items for exercising
                // each method of clsss Stack2, in this case, push and pop. There is also a menu item for
                // terminating the loop.
                System.out.print("Enter 1 to push, 2 to pop, 3 to print, and 4 to quit: ");
                choice = keyboard.nextInt();
                System.out.println();

                //This switch statement selects the proper case for the menu choice made by the user.
                switch (choice)
                {
                case 1: // Exercise the push method of class Stack2
                    System.out.print("Enter the new patient's id and priority: ");
                    id = keyboard.nextInt(); priority = keyboard.nextInt();
                    patient = new Patient(id, priority);
                    stack.push(patient);
                    System.out.println();
                    break;
                case 2: // Exercise the pop method of class Stack2
                    if (stack.isEmpty()) {
                        System.out.println("Cannot pop; stack is empty!");
                    }
                    else{
                        patient = stack.pop();
                        System.out.println("The top patient on the stack had id " + patient.getId() 
                                + " and priority " + patient.getPriority());                          
                    }
                    System.out.println();
                    break;
                case 3: // Print the stack
                    stack.print();
                    break;
                case 4: // Set done to true so that the loop will end
                    done = true;
                    break;
                default: 
                    // This default clause handles the case that the user has typed in an integer
                    // that is not one of the valid choices
                    System.out.println("The number you entered, "+ choice + ", + is not 1, 2, or 3. Try again!");
                    System.out.println();
                    break;
                }
            }
            System.out.println("...quitting");
        }         
    }