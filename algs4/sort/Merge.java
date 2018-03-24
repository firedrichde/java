package sort;

public class Merge extends SortExample{
private static Comparable[] tmp;
	
	public static void Sort(Comparable[] a) {
		tmp=new Comparable[a.length];
		sort(a,0,a.length-1);
	}
	
	private static void sort(Comparable[] a,int lo,int hi) {
		if(hi<=lo) {
			
			return;
		}
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}
	
	private static void merge(Comparable[] a,int lo,int mid,int hi) {
		for(int i=lo;i<=hi;i++) {
			tmp[i]=a[i];
		}
		int i=lo;
		int j=mid+1;
		for(int k=lo;k<=hi;k++) {
			if(i>mid)
				a[k]=tmp[j++];
			else if(j>hi)
				a[k]=tmp[i++];
			else if(less(tmp[i],tmp[j]))
				a[k]=tmp[i++];
			else
				a[k]=tmp[j++];
		}
	}
	
}
