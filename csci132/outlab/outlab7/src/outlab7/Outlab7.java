
package outlab7;

import java.util.*;

public class Outlab7 {
 public static void main(String[] args) {
 Scanner keyboard = new Scanner(System.in);
 int id, priority;
 String firstName; 
 String lastName;
 Patient patient;

 // This while statement continuously executes a loop that allows the
 // user to continuously test the stak implementation.
 // It is an example of how a class can be tested prior to its use in
 // a real program.
 System.out.print ("Please enter the maximum number of expected " 
 + "patients \nThis must be at least as large as the actual "
 + "number of patients you enter next: ");
 int maxPatients = keyboard.nextInt();
 Patient[] patientList = new Patient[maxPatients];
 boolean done = false;
 int i = 0;
 while (!done) 
 {
 System.out.print("Enter a patient id followed by a patient priority and a first and last name "
 + " followed by ENTER, or -1 -1 followed by ENTER to quit ");
 id = keyboard.nextInt(); keyboard.nextLine(); priority = keyboard.nextInt(); keyboard.nextLine(); firstName = keyboard.nextLine(); lastName = keyboard.nextLine();
 System.out.println();
                
 if (id == -1){
 done = true;
 }
 else {
 patientList[i] = new Patient(id, priority, firstName, lastName);
 i++;
 }
 }
 int numberOfPatients = i;
            
 // Copy the elements in patientList into an array that has exactly
 // the size of the number of input patients, so that this will
 // work with the book quicksort routine, which uses the .length 
 // instance variable of an incoming araay to determine how many
 // values are in it.
            
 Patient[] patientListCopy = new Patient[numberOfPatients];
 for (i=0; i < numberOfPatients; i++){
 patientListCopy[i] = patientList[i];
 }
            
 // Print the unsorted list of patients
 System.out.println("Unsorted Patient List:");
 for (i=0; i < numberOfPatients; i++){
 System.out.println(patientListCopy[i].getId() + " " + patientListCopy[i].getPriority() 
 + " " + patientListCopy[i].getFirstName() + " " + patientListCopy[i].getLastName()); 
 }
    
 // Sort and print sorted list of patients
 QuickSort.sort(patientListCopy);
 System.out.println("Sorted Patient List:");
 for (i=0; i < numberOfPatients; i++){
 System.out.println(patientListCopy[i].getId() + " " + patientListCopy[i].getPriority() 
 + " " + patientListCopy[i].getFirstName() + " " + patientListCopy[i].getLastName()); 
 }
    
 }
}