package dataStructure;
import edu.princeton.cs.algs4.StdOut;
/**
 * algs4 1.3.40
 * 前移编码
 * @author wang
 *
 */
public class MoveToFront {
	public class Node{
		private String value;
		private Node next;
		public Node(String item){
			value=item;
			next=null;
		}
	}
	
	private Node head;
	
	public MoveToFront() {
		String s="";
		head=new Node(s);
	}
	
	public MoveToFront(String[] data) {
		String s="";
		head=new Node(s);
		for(int i=0;i<data.length;i++) {
			insert(data[i]);
		}
	}
	
	public boolean isRepeat(String x) {
		Node tmp=head;
		while(tmp.next!=null)
		{
			if(tmp.value.equals(x))
				return true;
			tmp=tmp.next;
		}
		return false;
	}
	
	public void insert(String item) {
		Node add=new Node(item);
		if(isRepeat(item)) {
			delete(item);
		}
		Node tmp;
		if(head.next==null) {
			head.next=add;
			add.next=null;
			}
		else {
			tmp=head.next;
			head.next=add;
			add.next=tmp;
		}	
	}
	
	public void delete(String s) {
		Node tmp=head;
		while(!tmp.next.value.equals(s))
			tmp=tmp.next;
		Node second=tmp.next;
		tmp.next=second.next;
		second.next=null;
		
	}
	
	public void display() {
		Node tmp=head;
		while(tmp!=null) {
			StdOut.print(" "+tmp.value);
			tmp=tmp.next;
		}
		StdOut.print("\n");
	}
}
