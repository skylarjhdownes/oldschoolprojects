
// Huffman.java
// Logic structures for creating a huffman tree and code table
// called from HuffmanApp.java
////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

public class Huffman {

	private PriorityQ theQueue;
	private String inString;
	private int strLength;
	private Tree huffTree;
	private int freqTable[];
	private int alphabetSize = 28;
	private String codeTable[];
	private String codedMsg;
	private String decodedMsg;

	//HuffmanTree variables
	public String inputString;
	public int treeTable[];
	public String codeMsg;
	public PriorityQ theQ;
	
	Huffman (String s)
	{
		theQueue = new PriorityQ(alphabetSize);
		makeFreqTable(s);
		queueTrees();
		huffTree = HuffmanTree();
		Tree.displayTree();
		encode();
		System.out.println(decode());
	}
	
	private void makeFreqTable(String s)  //gets the frequency of each char in the string
	{
		for (int i=0;i<alphabetSize;i++)
		{
			char c = s.charAt(i);
			int cInt = (int)(c);
			freqTable[cInt-65]++;
		}
	}
	
	private void queueTrees() //sets up a tree for each type of char in the string
	{
		for (int i=0;i<alphabetSize;i++)
		{
			Node aNode = new Node ();
			aNode.letter = ((char)(i+65));
			aNode.freq = freqTable[i];
			Tree aTree = new Tree();
			aTree.root = aNode;
			theQueue.insertTree(aTree);
		}
	}
	
	private Tree HuffmanTree()
	{
		int i = 0;
		while (theQueue.queArray[i].root.hasChild() == true) //These references are getting really silly...
		{
			treeTable[];
			huffTree.insert();
			int freq = treeLeft
		}
		
	}
	

	
	private void makeCodeTable(Node nd, String bc)  //looks through the Huffman tree to create the encoding table
	{
		if (nd.hasChild() == true){  // I'm not sure what to do with this node when it only has one child.
			makeCodeTable(nd.leftChild, bc + "0");  // I think this skips some leaf nodes.
			makeCodeTable(nd.rightChild, bc + "1");
		}
		else {
			codeTable[nd.freq] = bc;
		}
	}
	
	public void encode()  //compresses the message
	{
		makeCodeTable(huffTree.root, "");
		for(int i = 0;i < inputString.length();i++)
		{
			int index = Tree.find(inputString.charAt(i));
			codedMsg = codedMsg + codeTable[index];
		}
	}
	
	public String decode()  //decompresses the message
	{
		int i = 0;
		Node theNode = new Node ();
		while (theNode.hasChild() == true)
		{
			if (codedMsg.charAt(i++) == '0'){
				theNode = theNode.leftChild;
			}
			else{
				theNode = theNode.rightChild;
			}
		}
		decodedMsg = decodedMsg + theNode.ch;
		return decodedMsg;
	}
}
