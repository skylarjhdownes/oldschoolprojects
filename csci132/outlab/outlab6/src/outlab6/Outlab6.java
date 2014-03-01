/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab6;

    class outlab6{
        
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
        StackNode back = null;
        
        public void push(Patient newPatient){
            StackNode newNode = new StackNode(newPatient);
            if (top == null){
                top = newNode;
                back = newNode;
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
        
        public void queue(Patient newPatient){
            StackNode newNode = new StackNode(newPatient);
            if (top == null){
                top = newNode;
                top.nextNode = null;
                back = newNode;
            }
            else{
                back.nextNode = newNode;
                back = newNode;
                back.nextNode = null;
            }
        }
        
        public Patient dequeue(){
            Patient tempPatient;
            tempPatient = top.patient;
            top = top.nextNode;
            return tempPatient;
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