
package outlab7;

public class Patient implements Comparable<Patient>{

 private int id; 
 private int priority;
 private String firstName; 
 private String lastName;

 public Patient(int idNumber, int priorityNumber, String in_firstName, String in_lastName){
    id = idNumber;
    priority = priorityNumber;
    firstName = in_firstName;
    lastName = in_lastName;
 }

 public int getId(){
     return id;
 }

 public int getPriority(){
    return priority;
 }
  
 public String getFirstName(){
    return firstName;
 }
 
 public String getLastName(){
    return lastName;
 }
  
 @Override
 public int compareTo(Patient otherPatient){
 return this.id - otherPatient.id;
 }
}