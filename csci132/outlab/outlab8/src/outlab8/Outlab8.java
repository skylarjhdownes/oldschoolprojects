package outlab8;

import java.util.*;

public class Outlab8 {
 
 public static void main(String[] args) {
 long time;
 long startTime = System.currentTimeMillis();
 Scanner keyboard = new Scanner(System.in);
 int id;
 int numberOfPatients;
 int par1;
 int par2;
 int par3;
 Patient patient;
 Random generator = new Random(314159);

 System.out.print("Enter a number of patient things:");
 numberOfPatients = keyboard.nextInt();
 Patient[] patientList = new Patient[numberOfPatients];
 
 for (int i=0; i < numberOfPatients; i++){
 id = generator.nextInt();
 patientList[i] = new Patient(id);
 }
            
 Patient[] patientListCopy = new Patient[numberOfPatients];
 for (int i=0; i < numberOfPatients; i++){
 patientListCopy[i] = patientList[i];
 }
 
par1 = QuickSort.partition(patientList, 0, (numberOfPatients-1));
par2 = QuickSort.partition(patientList, (par1+1), (numberOfPatients-1));
par3 = QuickSort.partition(patientList, 0, (par1-1));

startQSThread thread1 = new startQSThread(patientList, 0, (par3-1));
startQSThread thread2 = new startQSThread(patientList, (par3+1), (par1-1));
startQSThread thread3 = new startQSThread(patientList, (par1+1), (par2-1));
startQSThread thread4 = new startQSThread(patientList, (par2+1), numberOfPatients-1);

thread1.start();
thread2.start();
thread3.start();
thread4.start();

 try{ 
thread1.join();
thread2.join();
thread3.join();
thread4.join();
}
catch(InterruptedException e){

// blarg
}
 
 // Print the unsorted list of patients
 System.out.println("Unsorted Patient List:");
 for (int i=0; i < numberOfPatients; i++){
 System.out.println(patientListCopy[i].getId()); 
 }
    
 System.out.println("Sorted Patient List:");
 for (int i=0; i < numberOfPatients; i++){
 System.out.println(patientList[i].getId()); 
 }
 long endTime = System.currentTimeMillis();
 time = (endTime - startTime);
 System.out.println("total time:" + time);
 }
 
 
}