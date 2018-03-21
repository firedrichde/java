package dataStructureTestCase;

import dataStructure.MoveToFront;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MoveToFrontTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveToFront Test=new MoveToFront();
		while(!StdIn.isEmpty()) {
			String item=StdIn.readString();
			if(item.equals("quit")) 
				break;
			Test.insert(item);
		}
		Test.display();
	}
}
