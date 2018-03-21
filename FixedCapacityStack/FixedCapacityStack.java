package dataStructure;
import java.util.Iterator;

import edu.princeton.cs.algs4.*;
public class FixedCapacityStack<Item> implements Iterable<Item>{
	//count 指向stack top
	private Item[] arr;
	private int count;
	public FixedCapacityStack(int cap){
		arr=(Item[]) new Object[cap];
		count=0;
	}
	public Item pop() {
		if(count<0) {
			StdOut.println("Stack is empty.");
			//return null;
			}
		return arr[--count];
	}
	public void  push(Item another) {
		if(count>=arr.length) {
			StdOut.println("Stack is full.");
			}
		arr[count++]=another;
	}
	public int size() {
		return count;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
	}
	private class ReverseArrayIterator implements Iterator<Item>{
		private int i=count;
		public boolean hasNext() {
			return i>0;
		}
		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return arr[--i];
		}
	}
	
	
}
