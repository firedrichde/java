package dataStructureTestCase;

import dataStructure.FixedCapacityStack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;

public class StackTest {
	/**
	 * Test case for FixedCapacityStack 
	 * input file : stackTestData
	 * use Ctrl+z to interrupt
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedCapacityStack<String> test=new FixedCapacityStack<String>(10);
		while(!StdIn.isEmpty()) {
			String item=StdIn.readString();
			if(item.equals("quit")) {
				break;
			}
			if(!item.equals("-")) {
				test.push(item);
			}
			else {
				StdOut.println(test.pop()+" ");
			}
		}
		StdOut.println("data on the stack: ");
		//use iterator to print element in test
		for(String s: test) {
			StdOut.print(s+" ");
		}
		
	}

}
