
package outlab8;

public class Patient implements Comparable<Patient>{

 private int id;


 public Patient(int idNumber){
    id = idNumber;
 }

 public int getId(){
     return id;
 }


 @Override
 public int compareTo(Patient otherPatient){
 return this.id - otherPatient.id;
 }
}