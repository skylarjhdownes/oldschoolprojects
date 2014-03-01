
// HuffmanApp.java
// programming assignment 2
// Skylar Downes
// CSCI 232
// February 8th, 2013
// related files: tree.java, priorityQ.java, Huffman.java
////////////////////////////////////////////////////////////////
// Not finished, my apologies.  Most of the structure is done, 
// but the details are not.  Sorry for asking you to grade messy
// code.  Definitely budgeting more time for the next labs.
////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HuffmanApp {
	public static void main(String[] args) throws IOException
	   {
	   int value;

	   System.out.print("Enter character string for tree: ");  //program begins here
	   String str = getString();
	   Huffman theTree = new Huffman(str);
	   
	   
	   while(true)
	      {
	      System.out.print("Enter first letter of ");
	      System.out.print("show or traverse: ");
	      int choice = getChar();
	      switch(choice)
	         {
	         case 's':
	            theTree.displayTree();
	            break;
	         case 't':
	            System.out.print("Enter type 1, 2 or 3: ");
	            value = getInt();
	            theTree.traverse(value);
	            break;
	         default:
	            System.out.print("Invalid entry\n");
	         }  // end switch
	      }  // end while
	   
	   }  // end main()
	
	
	//-------------------------------------------------------------
	public static String getString() throws IOException
	   {
	   InputStreamReader isr = new InputStreamReader(System.in);
	   BufferedReader br = new BufferedReader(isr);
	   String s = br.readLine();
	   return s;
	   }
	//-------------------------------------------------------------
	public static char getChar() throws IOException
	   {
	   String s = getString();
	   return s.charAt(0);
	   }

	//------------------------------------------------------------
	public static int getInt() throws IOException
	   {
	   String s = getString();
	   return Integer.parseInt(s);
	   }
	//-------------------------------------------------------------
	   
}
