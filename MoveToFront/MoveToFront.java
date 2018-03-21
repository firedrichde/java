package dataStructure;
import edu.princeton.cs.algs4.StdOut;
/**
 * algs4 1.3.40
 * 前移编码策略
 * @author wang
 * 从标准输入中读取一个字符串，使用链表保存这些字符并清除重复字符，规定表头插入
 * 读取重复字符是，从链表中删去并再次插入表头。
 * 这种策略假设最近访问过的元素很可能再次访问，可用于缓存、数据压缩等场景
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
	//头节点
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
