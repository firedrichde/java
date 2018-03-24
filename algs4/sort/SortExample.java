package sort;

import edu.princeton.cs.algs4.StdOut;

public class SortExample {
	public static void Sort(Comparable[]a) {}
	
	public static boolean less(Comparable v,Comparable w) {
		return v.compareTo(w)<0;
	}
	
	public static void exch(Comparable[] a,int i,int j) {
		Comparable tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
	
	public static void show(Comparable[] a) {
		for(int i=0;i<a.length;i++) {
			if(i%10==0)
				StdOut.println();
			StdOut.print(a[i]+" ");
		}
		StdOut.println();
	}
	
	public static boolean isSorted(Comparable[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(less(a[i+1],a[i])) {
				return false;
			}
		}
		return true;
	}
}
